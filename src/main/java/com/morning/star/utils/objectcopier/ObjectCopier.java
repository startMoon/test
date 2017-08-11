package com.morning.star.utils.objectcopier;

import com.google.common.collect.HashBasedTable;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.cglib.beans.BeanCopier;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by liangguobin on 2017/5/24.
 */
public class ObjectCopier {

    @SuppressWarnings("rawtypes")
    private static volatile HashBasedTable<Class, Class, BeanCopier> shallowCopierCache = HashBasedTable.create();
    private static final Object shallowCacheLock = new Object();


    @SuppressWarnings("rawtypes")
    private static BeanCopier getShallowCopier(Class srcClass, Class targetClass) {
        BeanCopier copier = shallowCopierCache.get(srcClass, targetClass);

        if (copier == null) {
            synchronized (shallowCacheLock) {
                copier = shallowCopierCache.get(srcClass, targetClass);

                if (copier == null) {
                    BeanCopier beanCopier = BeanCopier.create(srcClass, targetClass, false);
                    shallowCopierCache.put(srcClass, targetClass, beanCopier);
                    return beanCopier;
                } else {
                    return copier;
                }
            }
        }
        return copier;
    }


    /**
     * 浅复制，只复制类型相同，名字相同的属性
     * 效率高, 优先使用
     *
     * @param <E>
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <E> E copyObject(Class<E> targetClass, Object src) {
        if (src == null) {
            return null;
        }

        BeanCopier copy = getShallowCopier(src.getClass(), targetClass);
        try {
            Object o = targetClass.newInstance();
            copy.copy(src, o, null);
            return (E) o;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 浅复制，只复制类型相同，名字相同的属性
     * 效率高, 优先使用
     *
     * @param <E>
     * @return
     */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static <E, R> E copyObject(Class<E> targetClass, R src, ObjectCopierFuture future) {
        E e = copyObject(targetClass, src);

        if (src == null) {
            return null;
        }

        future.process(src, e);
        return e;
    }

    /**
     * 浅复制，只复制类型相同，名字相同的属性,忽略名字相同，类别不同的属性
     * 效率高, 优先使用
     *
     * @param <E>
     * @return
     */
    public static <E> List<E> copyList(Class<E> targetClass, Collection<?> src) {
        List<E> result = new ArrayList<E>();
        if (CollectionUtils.isEmpty(src)) {
            return result;
        }
        try {
            for (Object o : src) {
                result.add(copyObject(targetClass, o));
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 浅复制，只复制类型相同，名字相同的属性,忽略名字相同，类别不同的属性
     * 效率高, 优先使用
     *
     * @param <E>
     * @return
     */
    public static <E, R> List<E> copyList(Class<E> targetClass, Collection<R> src, ObjectCopierFuture<E, R> future) {
        List<E> result = new ArrayList<>();
        try {
            for (Object o : src) {
                E e = copyObject(targetClass, o, future);
                result.add(e);
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
