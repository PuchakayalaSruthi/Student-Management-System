package com.psr.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeleteTest {
	public static void main(String[] args)
	{
	ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
	StudentDao dao = (StudentDao)context.getBean("stuDao");
	Student student = new Student();
	student.setId(15);
	dao.delete(student);
	System.out.println("Deleted successfully");
	}
}
