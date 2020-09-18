package com.llionframework.src.study.annotation;

import com.llionframework.src.study.config.ext.ExtConfig;
import org.junit.Test;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class IOCTest_Ext {

	/**
	 * {@link BeanFactoryPostProcessor}
	 * {@link BeanDefinitionRegistryPostProcessor}
	 */
	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext  = new AnnotationConfigApplicationContext(ExtConfig.class);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		System.out.println("---beanDefinitionNames: {}" + Arrays.asList(beanDefinitionNames));
		applicationContext.close();
	}



}
