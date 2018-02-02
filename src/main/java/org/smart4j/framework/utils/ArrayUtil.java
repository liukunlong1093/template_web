package org.smart4j.framework.utils;

import org.apache.commons.lang3.ArrayUtils;

/**
 * 数组工具类
 *
 * @author liukl
 * @date 2018/2/2
 */
public final class ArrayUtil {

    /**
     * 判断数组是否非空.
     * @param array 数组对象
     * @return <code>true</code>不为空<code>false</code>为空
     */
    public static boolean isNotEmpty(Object [] array){
        return !isEmpty(array);
    }

    /**
     * 判断数组是否为空
     * @param array 数组对象
     * @return  <code>true</code>为空<code>false</code>不为空
     */
    public static boolean isEmpty(Object [] array){
        return ArrayUtils.isEmpty(array);
    }
}
