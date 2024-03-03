package com.psr.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class InsertTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		StudentDao dao = (StudentDao)context.getBean("stuDao");
		dao.insert(new Student("Shashi", "psr@gmail.com", "ECE", "Warangal", "9722909925"));
		System.out.println("inserted successfully");
	}

}