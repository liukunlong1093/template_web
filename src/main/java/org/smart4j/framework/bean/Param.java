package org.smart4j.framework.bean;

import org.smart4j.framework.utils.CastUtil;
import org.smart4j.framework.utils.CollectionUtil;

import java.util.Map;

/**
 * 请求参数对象
 *
 * @author liukl
 * @date 2018/2/2
 */
public class Param {
    private Map<String,Object> paramMap;
    public Param(Map<String,Object> paramMap){
        this.paramMap=paramMap;
    }

    /**
     * 根据参数名获取long型参数值
     * @param name 参数名
     * @return long型参数值
     */
    public long getLong(String name){
        return CastUtil.castLong(paramMap.get(name));
    }

    /**
     * 获取所有字段信息
     * @return 所有字段信息
     */
    public Map <String, Object> getParamMap() {
        return paramMap;
    }

    /**
     * 验证参数是否为空
     * @return <code>true</code>为空<code>false</code>不为空
     */
    public boolean isEmpty(){
        return CollectionUtil.isEmpty(paramMap);
    }


}
