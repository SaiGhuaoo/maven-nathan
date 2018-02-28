package com.nathan.modules.genericity;

public class Test {
//	@Deprecated  //过期方法的注解
	public static void print(Demo<?> demo){
		demo.print();
	}
	
	public static void main(String args[]){
		Demo<Dog> dogDemo = new Demo<Dog>(new Dog());
		Demo<Cat> catDemo = new Demo<Cat>(new Cat());
//		dogDemo.print();
//		catDemo.print();
		print(dogDemo);
		print(catDemo);
		Demo<Animal> animalDemo = new Demo<Animal>(new Animal());
		print(animalDemo);
	}
}
