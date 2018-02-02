package org.smart4j.framework;

/**
 * 提供相关配置项常量
 *
 * @author liukl
 * @date 2018/2/1
 */
public interface ConfigConstant {
    /** MySQL驱动*/
    String CONFIG_FILE="smart.properties";

    /** MySQL驱动*/
    String JDBC_DRIVER="smart.framework.jdbc.driver";

    /** MySQL连接地址*/
    String JDBC_URL="smart.framework.jdbc.url";

    /** MySQL用户名*/
    String JDBC_USERNAME="smart.framework.jdbc.username";

    /** MySQL密码*/
    String JDBC_PASSWORD="smart.framework.jdbc.password";

    /** 项目的基础包名*/
    String APP_BASE_PACKAGE="smart.framework.app.base_package";

    /** JSP的基础路径*/
    String APP_JSP_PATH="smart.framework.jsp_ptah";

    /** 静态资源文件的基础路径,比如JS,CSS,图片等*/
    String APP_ASSET_PATH="smart.framework.asset_path";
}
