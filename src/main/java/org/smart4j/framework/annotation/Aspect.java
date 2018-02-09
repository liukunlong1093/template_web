package org.smart4j.framework.annotation;

import java.lang.annotation.*;

/**
 * 切面注解
 *
 * @author liukl
 * @date 2018/2/7
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {
    /**
     * 注解
     * @return
     */
    Class<? extends Annotation> value();
}
