package com.wr.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * properties配置文件工具�?
 * @author user
 *
 */
public class PropertiesUtil {

	/**
	 * 根据key获取value
	 * @param key
	 * @return
	 */
	public static String getValue(String key){
		Properties prop=new Properties();
		InputStream in=new PropertiesUtil().getClass().getResourceAsStream("/open1111.properties");
		try {
			prop.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}
}
