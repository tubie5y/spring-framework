package com.llionframework.src.parse.v2.chapter02;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;

import static org.junit.Assert.assertEquals;

public class BeanFactoryTest {
	public static void main(String[] args) {
		testSimpleLoad();
	}

	public static void testSimpleLoad(){
		// XmlBeanFactory 已废弃，详见doc
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
		MyTestBean bean=(MyTestBean) bf.getBean("myTestBean");
		assertEquals("testStr",bean.getTestStr());
	}

	/**
	 * my
	 */
	public static void testSimpleLoad2(){
		BeanFactory bf = new DefaultListableBeanFactory(new AnnotationConfigApplicationContext(BeanConfig.class));
		MyTestBean bean=(MyTestBean) bf.getBean("myTestBean");
		System.out.println("testStr".equals(bean.getTestStr()));
	}
}
