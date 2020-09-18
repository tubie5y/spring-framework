package com.llionframework.src.study.config.ext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * <p></p>
 *
 * @author: lijian
 * @create: 2020-09-17 11:26
 **/
public class TestMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext  = new AnnotationConfigApplicationContext(ExtConfig.class);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		System.out.println("---beanDefinitionNames: {}" + Arrays.asList(beanDefinitionNames));
		applicationContext.close();
	}
}
