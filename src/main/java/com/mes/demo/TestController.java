package com.mes.demo;

import org.smart4j.framework.annotation.Action;
import org.smart4j.framework.annotation.Controller;
import org.smart4j.framework.bean.Param;
import org.smart4j.framework.bean.View;
import org.smart4j.framework.helper.ServletHelper;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 一句话描述这个类的作用
 *
 * @author liukl
 * @date 2018/2/2
 */
@Controller
public class TestController {

    @Action("get:/query")
    public View query(){
        String msg=ServletHelper.getRequestAttribute("msg");
        System.out.println(msg);
        View view=new View("test.jsp");
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime=dateFormat.format(new Date());
        view.addModel("currentTime",currentTime);
        return view;
    }
}
