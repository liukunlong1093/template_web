package org.smart4j.framework.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回视图对象
 *
 * @author liukl
 * @date 2018/2/2
 */
public class View {
    /**
     * 视图路径
     */
    private String path;

    private Map<String,Object> model;

    public View(String path){
        this.path=path;
        this.model=new HashMap<>();
    }

    public View addModel(String key,String value){
        model.put(key,value);
        return this;
    }

    public String getPath() {
        return path;
    }

    public Map <String, Object> getModel() {
        return model;
    }
}
