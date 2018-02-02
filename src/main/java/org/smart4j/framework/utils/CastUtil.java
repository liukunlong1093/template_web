package org.smart4j.framework.utils;

/**
 * 转型操作工具类
 *
 * @author liukl
 * @date 2018/2/1
 */
public class CastUtil {

    /**
     * 转为String型(默认为空字符串)
     *
     * @param obj 对象
     * @return 字符串
     */
    public static String castString(Object obj) {
        return castString(obj, "");
    }


    /**
     * 转为String型(提供默认值)
     *
     * @param obj          对象
     * @param defaultValue 默认值
     * @return 字符串
     */
    public static String castString(Object obj, String defaultValue) {
        return obj != null ? String.valueOf(obj) : defaultValue;
    }

    /**
     * 转double类型(默认值0)
     *
     * @param obj 对象
     * @return double
     */
    public static double castDouble(Object obj) {
        return castDouble(obj, 0);
    }

    /**
     * 转double类型(提供默认值)
     *
     * @param obj          对象
     * @param defaultValue 默认值
     * @return double
     */
    public static double castDouble(Object obj, double defaultValue) {
        double doubleValue = defaultValue;
        if (obj != null) {
            String strValue = castString(obj);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    doubleValue = Double.parseDouble(strValue);
                } catch (NumberFormatException e) {
                    doubleValue = defaultValue;
                }
            }
        }
        return doubleValue;
    }

    /**
     * 转long类型(默认值0)
     *
     * @param obj 对象
     * @return long
     */
    public static long castLong(Object obj) {
        return castLong(obj, 0);
    }

    /**
     * 转long类型(提供默认值)
     *
     * @param obj          对象
     * @param defaultValue 默认值
     * @return long
     */
    public static long castLong(Object obj, long defaultValue) {
        long longValue = defaultValue;
        if (obj != null) {
            String strValue = castString(obj);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    longValue = Long.parseLong(strValue);
                } catch (NumberFormatException e) {
                    longValue = defaultValue;
                }
            }
        }
        return longValue;
    }


    /**
     * 转int类型(默认值0)
     *
     * @param obj 对象
     * @return int
     */
    public static int castInt(Object obj) {
        return castInt(obj, 0);
    }

    /**
     * 转int类型(提供默认值)
     *
     * @param obj          对象
     * @param defaultValue 默认值
     * @return int
     */
    public static int castInt(Object obj, int defaultValue) {
        int intValue = defaultValue;
        if (obj != null) {
            String strValue = castString(obj);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    intValue = Integer.parseInt(strValue);
                } catch (NumberFormatException e) {
                    intValue = defaultValue;
                }
            }
        }
        return intValue;
    }

    /**
     * 转boolean类型(默认值false)
     *
     * @param obj 对象
     * @return boolean
     */
    public static boolean castBoolean(Object obj) {
        return castBoolean(obj, false);
    }

    /**
     * 转boolean类型(默认值false)
     *
     * @param obj 对象
     * @return boolean
     */
    public static boolean castBoolean(Object obj, boolean defaultValue) {
        boolean booleanValue = defaultValue;
        if (obj != null) {
            booleanValue = Boolean.parseBoolean(castString(obj));
        }
        return booleanValue;
    }

}
