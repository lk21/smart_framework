package org.smart4j.framework.bean;

/**
 * 返回数据对象
 * 
 * 构建组：大道金服科技部
 * 作者:linkai
 * 邮箱:linkai@ddjf.com.cn
 * 日期:2017年11月14日下午3:38:43
 * 功能说明：
 *
 */
public class Data {
    /*
     * 模型数据
     */
    private Object model;
    
    public Data(Object model) {
        this.model = model;
    }
    
    public Object getModel() {
        return model;
    }

}
