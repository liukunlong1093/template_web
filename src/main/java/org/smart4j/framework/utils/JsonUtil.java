package org.smart4j.framework.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * JSON工具类
 *
 * @author liukl
 * @date 2018/2/2
 */
public class JsonUtil {
    private static final Logger LOGGER= LoggerFactory.getLogger(JsonUtil.class);
    private static final SerializeConfig mapping = new SerializeConfig();

    /**
     * 将POJO 转JSON字符串
     * @param obj 对象
     * @param <T> 对象类型
     * @return JSON字符串
     */
    public static <T> String toJson(T obj){
        String json;
        try {
            json= JSON.toJSONString(obj, mapping);
        }catch (Exception e){
            LOGGER.error("cast POJO to JSON failure",e);
            throw new RuntimeException(e);
        }
        return json;
    }

    /**
     * 将JSON转为POJO
     * @param json JSON字符串
     * @param type 对象类型
     * @param <T>
     * @return POJO
     */
    public static <T> T fromJson(String json,Class<T> type){
        T pojo;
        try {
            pojo=JSON.parseObject(json,type);
        }catch (Exception e){
            LOGGER.error("convert JSON to POJO failure");
            throw new RuntimeException(e);
        }
        return pojo;
    }
}
