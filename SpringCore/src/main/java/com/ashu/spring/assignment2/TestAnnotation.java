package com.ashu.spring.assignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotation {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		BeanConfig hello=context.getBean(BeanConfig.class);
		MyBean hello1=context.getBean(MyBean.class);
		System.out.println("Message "+hello.BeanConfi());
		System.out.println("Message "+hello.BeanConfi2());
		System.out.println("Message "+hello.BeanConfi3());
		System.out.println("Message "+hello1.BeanConfigure());
	}

}
