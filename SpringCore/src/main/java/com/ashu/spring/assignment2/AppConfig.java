package com.ashu.spring.assignment2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.ashu")
public class AppConfig {
	
	@Bean
	public BeanConfig getHelloB(){	
	BeanConfig hb=new BeanConfig();
	return hb;
	}
	@Bean
	public MyBean get(){
		MyBean mb=new MyBean();
		return mb;
	}
	
}
