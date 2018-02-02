package com.nathan.test;

import java.util.Random;

public class TestRandom {
	public static void main(String args[]){
		Random random = new Random(1000);
		for(int i=1;i<5;i++){
			System.out.println(random.nextInt());
		}
	}
}
