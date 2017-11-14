package org.smart4j.framework.bean;

import java.util.Map;

import org.smart4j.framework.util.CastUtil;

/**
 * 请求参数对象
 * 
 * 构建组：大道金服科技部
 * 作者:linkai
 * 邮箱:linkai@ddjf.com.cn
 * 日期:2017年11月14日下午3:01:37
 * 功能说明：
 *
 */
public class Param {
    
    private Map<String, Object> paramMap;
    
    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }
    
    /*
     * 根据参数名获取long型参数值
     */
    public long getLong(String name) {
        return CastUtil.castLong(paramMap.get(name));
    }
    
    /*
     * 获取所有字段信息
     */
    public Map<String, Object> getMap() {
        return paramMap;
    }

}
