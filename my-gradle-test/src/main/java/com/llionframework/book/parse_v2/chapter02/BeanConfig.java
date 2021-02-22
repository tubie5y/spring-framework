package com.llionframework.book.parse_v2.chapter02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	@Bean
	public MyTestBean myTestBean(){
		return new MyTestBean();
	}

}
