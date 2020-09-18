package com.llionframework.src.study.config.ext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.llionframework.src.study.config.ext.dto.Blue;
import com.llionframework.src.study.config.ext.dto.MyBeanDefinitionRegistryPostProcessor;
import com.llionframework.src.study.config.ext.dto.MyBeanFactoryPostProcessor;

@Configuration
public class ExtConfig {

	/**
	 * BeanFactoryPostProcessor
	 */
	@Bean
	public MyBeanFactoryPostProcessor myBeanFactoryPostProcessor(){
		return new MyBeanFactoryPostProcessor();
	}

	/**
	 * 普通组件创建对象
	 */
	@Bean
	public Blue blue(){
		return new Blue();
	}

	/**
	 * BeanDefinitionRegistryPostProcessor
	 */
	@Bean
	public MyBeanDefinitionRegistryPostProcessor myBeanDefinitionRegistryPostProcessor(){
		return new MyBeanDefinitionRegistryPostProcessor();
	}

}
