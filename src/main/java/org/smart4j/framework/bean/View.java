package org.smart4j.framework.bean;

import java.util.Map;

/**
 * 返回视图对象
 * 
 * 构建组：大道金服科技部
 * 作者:linkai
 * 邮箱:linkai@ddjf.com.cn
 * 日期:2017年11月14日下午3:33:34
 * 功能说明：
 *
 */
public class View {
    /*
     * 视图路径
     */
    private String path;
    
    /*
     * 模型数据
     */
    private Map<String, Object> model;
    
    public View addModel(String key, Object value) {
        model.put(key, value);
        return this;
    }
    
    public String getPath() {
        return path;
    }
    
    public Map<String, Object> getModel() {
        return model;
    }

}
