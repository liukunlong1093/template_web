package org.smart4j.framework.helper;

import org.smart4j.framework.annotation.Controller;
import org.smart4j.framework.annotation.Service;
import org.smart4j.framework.utils.ClassUtil;

import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.Set;

/**
 * 类操作助手类
 *
 * @author liukl
 * @date 2018/2/2
 */
public class ClassHelper {
    /**
     * 类集合(用于存放所加载的类)
     */
    private static final Set<Class<?>> CLASS_SET;

    static {
        String basePackage=ConfigHelper.getAppBasePackage();
        CLASS_SET= ClassUtil.getClassSet(basePackage);
    }

    /**
     * 获取应用包名下面的所有类
     * @return 应用包名下面的所有类
     */
    public static Set<Class<?>> getClassSet(){
        return CLASS_SET;
    }

    /**
     * 获取应用包下面的所有Service类
     * @return 应用包下面的所有Service类
     */
    public static Set<Class<?>> getServiceClassSet(){
        Set<Class<?>> classSet=new HashSet <>();
        for(Class<?> cls:CLASS_SET){
            if(cls.isAnnotationPresent(Service.class)){
                classSet.add(cls);
            }
        }
        return classSet;
    }

    /**
     * 获取应用包下面的所有Controller类
     * @return 应用包下面的所有Controller类
     */
    public static Set<Class<?>> getControllerClassSet(){
        Set<Class<?>> classSet=new HashSet <>();
        for(Class<?> cls:CLASS_SET){
            if(cls.isAnnotationPresent(Controller.class)){
                classSet.add(cls);
            }
        }
        return classSet;
    }

    /**
     * 获取应用包下面的所有Bean类(包含Service类,Controller类)
     * @return 应用包下面的所有Bean类(包含Service类,Controller类)
     */
    public static Set<Class<?>> getBeanClassSet(){
        Set<Class<?>> beanClassSet=new HashSet <>();
        beanClassSet.addAll(getServiceClassSet());
        beanClassSet.addAll(getControllerClassSet());
        return beanClassSet;
    }

    /**
     * 获取应用包名某父类(或接口)的所有子类(或实现类)
     * @param superClass 父Class类
     * @return  应用包名某父类(或接口)的所有子类(或实现类)
     */
    public static Set<Class<?>> getClassSetBySuper(Class<?> superClass){
        Set<Class<?>> classSet=new HashSet <>();
        for(Class<?> cls:CLASS_SET){
            if(superClass.isAssignableFrom(cls) && !superClass.equals(cls)){
                classSet.add(cls);
            }
        }
        return classSet;
    }

    /**
     * 获取应用包名下带有某些注解的所有类
     * @param annotationClass 注解类
     * @return 应用包名下带有某些注解的所有类
     */
    public static Set<Class<?>> getClassSetByAnnotation(Class<? extends Annotation> annotationClass){
        Set<Class<?>> classSet=new HashSet <>();
        for(Class<?> cls:CLASS_SET){
            if(cls.isAnnotationPresent(annotationClass)){
                classSet.add(cls);
            }
        }
        return classSet;
    }






}
