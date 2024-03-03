package com.psr.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UpdateText {
public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		StudentDao dao = (StudentDao)context.getBean("stuDao");
		dao.update(new Student(2,"Akshara","IT","Pune","akshara@gmail.com","9885085833"));
		System.out.println("Update successfully");
	}

}
