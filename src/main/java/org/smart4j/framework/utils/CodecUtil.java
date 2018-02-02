package org.smart4j.framework.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * 编码与解码操作工具类
 *
 * @author liukl
 * @date 2018/2/2
 */
public class CodecUtil {
    private static final Logger LOGGER= LoggerFactory.getLogger(CodecUtil.class);

    /**
     * 将URL编码
     * @param source 来源字符串
     * @return 编码后的字符串
     */
    public static String encodeUrl(String source){
        String target;
        try {
            target= URLEncoder.encode(source,"UTF-8");
        }catch (Exception e){
            LOGGER.error("encode url failure",e);
            throw new RuntimeException(e);
        }
        return target;
    }

    /**
     * 将URL解码
     * @param source 来源字符串
     * @return 解码后字符串
     */
    public static String decodeUrl(String source){
        String target;
        try {
            target= URLDecoder.decode(source,"UTF-8");
        }catch (Exception e){
            LOGGER.error("decode url failure",e);
            throw new RuntimeException(e);
        }
        return target;

    }
}
