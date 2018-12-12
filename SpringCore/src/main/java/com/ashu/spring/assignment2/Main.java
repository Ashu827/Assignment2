package com.ashu.spring.assignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring1.xml");
		Question question=(Question) context.getBean("set");
		question.show();

	}

}
