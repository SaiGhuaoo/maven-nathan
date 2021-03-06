package com.nathan.common.config;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.google.common.collect.Maps;
import com.nathan.common.utils.PropertiesLoader;

public class Global {
	
	/**
	 * 当前对象实例
	 */
	private static Global global = new Global();
	
	/**
	 * 保存全局属性值
	 */
	private static Map<String,String> map = Maps.newHashMap();
	
	/**
	 * 基础属性文件加载
	 */
	private static PropertiesLoader loader = new PropertiesLoader("nathan.properties");
	
	/**
	 * 获取当前对象实例
	 * @return
	 */
	public static Global getInstance(){
		return global;
	}
	
	/**
	 * 获取配置内容
	 * @param key		propertites中的key
	 * @return
	 */
	public static String getConfig(String key){
		String value = map.get(key);
		if (value == null){
			value = loader.getProperty(key);
			map.put(key, value != null ? value : StringUtils.EMPTY);
		}
		return value;
	}
	
	/**
	 * 获取其他配置文件的配置信息
	 * @param fileName
	 * @param key
	 * @return
	 */
	public static String getConfig(String fileName,String key){
		String fileKey = fileName + key;
		String value = map.get(fileKey);
		if(value == null){
			PropertiesLoader loader = new PropertiesLoader(fileName);
			value = loader.getProperty(key);
			map.put(fileKey, value);
		}
		return value;
	}
	
	
}