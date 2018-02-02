package org.smart4j.framework.utils;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;

import java.util.Collection;
import java.util.Map;

/**
 * 集合工具类
 *
 * @author liukl
 * @date 2018/2/1
 */
public class CollectionUtil {
    /**
     * 判断collection是否为空
     *
     * @param collection 集合对象
     * @return <code>true</code>为空,<code>false</code>不为空
     */
    public static boolean isEmpty(Collection <?> collection) {
        return CollectionUtils.isEmpty(collection);
    }

    /**
     * 判断collection是否非空
     *
     * @param collection 集合对象
     * @return <code>true</code>不为空,<code>false</code>为空
     */
    public static boolean isNotEmpty(Collection <?> collection) {
        return !isEmpty(collection);
    }

    /**
     * 判断map是否为空
     *
     * @param map Map对象
     * @return <code>true</code>为空,<code>false</code>不为空
     */
    public static boolean isEmpty(Map <?, ?> map) {
        return MapUtils.isEmpty(map);
    }

    /**
     * 判断map是否非空
     *
     * @param map Map对象
     * @return <code>true</code>不为空,<code>false</code>为空
     */
    public static boolean isNotEmpty(Map <?, ?> map) {
        return !isEmpty(map);
    }
}
