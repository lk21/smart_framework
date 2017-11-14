package org.smart4j.framework.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 服务器类注解
 * 
 * 构建组：大道金服科技部
 * 作者:linkai
 * 邮箱:linkai@ddjf.com.cn
 * 日期:2017年11月14日上午9:44:02
 * 功能说明：
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Service {

}
