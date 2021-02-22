package com.llionframework.ioc;

import com.llionframework.ioc.dto.Blue;
import com.llionframework.ioc.dto.MyBeanDefinitionRegistryPostProcessor;
import com.llionframework.ioc.dto.MyBeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
