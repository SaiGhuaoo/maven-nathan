package com.nathan.common.config;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.google.common.collect.Maps;
import com.nathan.common.utils.PropertiesLoader;

public class Global {
	
	/**
	 * ��ǰ����ʵ��
	 */
	private static Global global = new Global();
	
	/**
	 * ����ȫ������ֵ
	 */
	private static Map<String,String> map = Maps.newHashMap();
	
	/**
	 * ���������ļ�����
	 */
	private static PropertiesLoader loader = new PropertiesLoader("nathan.properties");
	
	/**
	 * ��ȡ��ǰ����ʵ��
	 * @return
	 */
	public static Global getInstance(){
		return global;
	}
	
	/**
	 * ��ȡ��������
	 * @param key		propertites�е�key
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
	 * ��ȡ���������ļ���������Ϣ
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