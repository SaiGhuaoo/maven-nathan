package com.nathan.modules.genericity;

/**
 * ·ºÐÍDemo
 * @author H
 *
 * @param <T>
 */
public class Demo<T extends Animal> {
	private T t;
	
	public Demo(T t){
		this.t = t;
	}
	
	public void print(){
		System.out.println(t.getClass().getName());
	}
}
