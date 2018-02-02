package org.smart4j.framework.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * 字符串工具类
 *
 * @author liukl
 * @date 2018/2/1
 */
public class StringUtil {
    /**
     * 判断字符串是否为空
     * @param str 字符串
     * @return <code>true</code>为空,<code>false</code>不为空
     */
    public static boolean isEmpty(String str){
        if(str!=null){
            str=str.trim();
        }
        return StringUtils.isEmpty(str);

    }

    /**
     * 判断字符串是否不为空
     * @param str 字符串
     * @return <code>true</code>不为空,<code>false</code>为空
     */
    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }

    /**
     * 分隔字符串
     * @param str
     * @param regex
     * @return
     */
    public static String[] splitString(String str,String regex){
        return str.split(regex);
    }

}
