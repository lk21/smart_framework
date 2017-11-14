package org.smart4j.framework.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 流操作工具类
 * 
 * 构建组：大道金服科技部
 * 作者:linkai
 * 邮箱:linkai@ddjf.com.cn
 * 日期:2017年11月14日下午3:58:44
 * 功能说明：
 *
 */
public final class StreamUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(StreamUtil.class);
    
    /*
     * 从输入流中获取字符串
     */
    public static String getString(InputStream is) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line;
            while((line = reader.readLine()) != null) {
                sb.append(line);
            }
        } catch(Exception e) {
            LOGGER.error("get string failure", e);
            throw new RuntimeException(e);
        }
            return sb.toString();
    }

}
