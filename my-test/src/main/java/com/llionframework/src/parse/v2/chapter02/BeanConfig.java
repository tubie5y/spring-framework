package com.llionframework.src.parse.v2.chapter02;

import com.llionframework.src.study.config.ext.dto.Blue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	@Bean
	public MyTestBean myTestBean(){
		return new MyTestBean();
	}

}
