package org.smart4j.framework.helper;

import org.smart4j.framework.annotation.Action;
import org.smart4j.framework.annotation.Inject;
import org.smart4j.framework.bean.Handler;
import org.smart4j.framework.bean.Request;
import org.smart4j.framework.utils.ArrayUtil;
import org.smart4j.framework.utils.CollectionUtil;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 控制器助手类
 *
 * @author liukl
 * @date 2018/2/2
 */
public class ControllerHelper {
    private static final Map<Request,Handler> ACTION_MAP=new HashMap <>();
    static {
        //获取所有的Controller类
        Set<Class<?>> controllerClassSet=ClassHelper.getControllerClassSet();
        if(CollectionUtil.isNotEmpty(controllerClassSet)){
            //遍历所有Controller类
            for(Class<?> controllerClass:controllerClassSet){
                //获取Controller类中定义的所有方法
                Method[] methods=controllerClass.getDeclaredMethods();
                //遍历Controller中定义的所有方法
                if(ArrayUtil.isNotEmpty(methods)){
                    for (Method method:methods){
                        //判断当前方法是否带有action注解
                        if(method.isAnnotationPresent(Action.class)){
                            //从action注解中获取URL映射规则
                            Action action=method.getAnnotation(Action.class);
                            String mapping=action.value();
                            //验证URL映射规则
                            if(mapping.matches("\\w+:/\\w*")){
                                String [] array=mapping.split(":");
                                if(ArrayUtil.isNotEmpty(array) && array.length==2){
                                    //获取请求方法与请求路径
                                    String requestMethod=array[0];
                                    String requestPath=array[1];
                                    Request request=new Request(requestMethod,requestPath);
                                    Handler handler=new Handler(controllerClass,method);
                                    //初始化Action Map
                                    ACTION_MAP.put(request,handler);
                                }
                            }
                        }
                    }

                }
            }
        }

    }

    /**
     * 获取 Handler
     * @param requestMethod 请求方法
     * @param requestPath 请求路径
     * @return Handler
     */
    public static Handler getHandler(String requestMethod,String requestPath){
        Request request=new Request(requestMethod,requestPath);
        return ACTION_MAP.get(request);
    }
}
