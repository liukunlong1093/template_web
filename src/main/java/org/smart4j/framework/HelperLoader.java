package org.smart4j.framework;

import org.smart4j.framework.helper.BeanHelper;
import org.smart4j.framework.helper.ClassHelper;
import org.smart4j.framework.helper.ConfigHelper;
import org.smart4j.framework.helper.IocHelper;
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
                IocHelper.class,
                ConfigHelper.class
        };
        for (Class<?> cls:classList){
            ClassUtil.loadClass(cls.getName(),true);
        }
    }
}
