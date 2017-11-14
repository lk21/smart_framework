package org.smart4j.framework.bean;

import java.lang.reflect.Method;

/**
 * 封装Action信息
 * 
 * 构建组：大道金服科技部
 * 作者:linkai
 * 邮箱:linkai@ddjf.com.cn
 * 日期:2017年11月14日下午2:24:47
 * 功能说明：
 *
 */
public class Handler {
    /*
     * Controller类
     */
    public Class<?> controllerClass;
    
    /*
     * Action方法
     */
    private Method actionMethod;
    
    public Handler(Class<?> controllerClass, Method actionMethod) {
        this.controllerClass = controllerClass;
        this.actionMethod = actionMethod;
    }
    
    public Class<?> getControllerClass() {
        return controllerClass;
    }
    
    public Method getActionMethod() {
        return actionMethod;
    }

}
