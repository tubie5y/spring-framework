package com.llionframework.book.parse_v2.chapter02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class BeanFactoryTest {
	public static void main(String[] args) {
//		testSimpleLoad();
		testSimpleLoad2();
	}

//	public static void testSimpleLoad(){
//		// XmlBeanFactory 已废弃，详见doc
//		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
//		MyTestBean bean=(MyTestBean) bf.getBean("myTestBean");
//		assertEquals("testStr",bean.getTestStr());
//	}

	/**
	 * my
	 */
	public static void testSimpleLoad2(){
		BeanFactory bf = new DefaultListableBeanFactory(new AnnotationConfigApplicationContext(BeanConfig.class));
		MyTestBean bean=(MyTestBean) bf.getBean("myTestBean");
		System.out.println("testStr".equals(bean.getTestStr()));
	}
}
