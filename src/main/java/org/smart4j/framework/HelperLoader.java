package org.smart4j.framework;

import org.smart4j.framework.helper.*;
import org.smart4j.framework.utils.ClassUtil;

/**
 * 加载相应的Helper类
 *
 * @author liukl
 * @date 2018/2/2
 */
public class HelperLoader {
    public static void init(){
        Class<?> [] classList={
                ClassHelper.class,
                BeanHelper.class,
                AopHelper.class,
                IocHelper.class,
                ConfigHelper.class
        };
        for (Class<?> cls:classList){
            ClassUtil.loadClass(cls.getName(),true);
        }
    }
}
