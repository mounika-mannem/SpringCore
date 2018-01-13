package com.ten;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		
		Animal animal = (Animal) context.getBean("AnimalBean");
		System.out.println(animal);
	}

}
