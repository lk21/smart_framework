package org.smart4j.framework.bean;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * 封装请求信息
 * 
 * 构建组：大道金服科技部
 * 作者:linkai
 * 邮箱:linkai@ddjf.com.cn
 * 日期:2017年11月14日下午2:09:24
 * 功能说明：
 *
 */
public class Request {
    /*
     * 请求方法
     */
    private String requestMethod;
    
    /*
     * 请求路径
     */
    private String requestPath;
    
    public Request(String requestMethod, String requestPath) {
        this.requestMethod = requestMethod;
        this.requestPath = requestPath;
    }
    
    public String getRequestMethod() {
        return requestMethod;
    }
    
    public String getRequestPath() {
        return requestPath;
    }
    
    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
    
    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

}
