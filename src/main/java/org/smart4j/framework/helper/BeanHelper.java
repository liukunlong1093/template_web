package org.smart4j.framework.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.framework.utils.ReflectionUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Bean助手类
 *
 * @author liukl
 * @date 2018/2/2
 */
public class BeanHelper {
    private static final Logger LOGGER= LoggerFactory.getLogger(BeanHelper.class);

    /** 定义Bean映射(用于存放Bean类与Bean实例的映射关系)*/
    private static final Map<Class<?>,Object> BEAN_MAP=new HashMap<>();

    static {
        Set<Class<?>> beanClassSet=ClassHelper.getBeanClassSet();
        for(Class<?> beanClass:beanClassSet){
            Object obj= ReflectionUtil.newInstance(beanClass);
            BEAN_MAP.put(beanClass,obj);
        }
    }

    /**
     * 获取Bean映射
     * @return Bean映射
     */
    public static Map<Class<?>,Object> getBeanMap(){
        return BEAN_MAP;
    }

    /**
     * 获取Bean实例
     * @param cls class对象
     * @param <T> 对象类型
     * @return Bean实例
     */
    public static <T> T getBean(Class<T> cls){
        if(!BEAN_MAP.containsKey(cls)){
            throw  new RuntimeException("can not get bean by class:"+cls);
        }
        return (T) BEAN_MAP.get(cls);
    }
}
