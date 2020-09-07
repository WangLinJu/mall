package com.itheilv.mall.common;

import java.util.ResourceBundle;

/**
 * @author WSQ
 * @since 2020-09-07
 * Properties工具类
 * TODO 待优化
 */
public class PropertiesFileUtil {

    public static String getValue(String path, String key) {
        ResourceBundle generator = ResourceBundle.getBundle(path);
        return generator.getString(key);
    }
}
