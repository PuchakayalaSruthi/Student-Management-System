package com.psr.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RetriveData {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		StudentDao dao = (StudentDao)context.getBean("stuDao");
		List<Student> list1 = dao.getAllstudents();
		System.out.println("Output from getAllStudents() method:");
		for(Student stu : list1)
		{
			System.out.println(stu.getId()+" "+stu.getName()+" "+stu.getBranch()+" "+stu.getAddress()+" "+stu.getEmail()+" "+stu.getPhoneno());
		}
		
	

		
		List<Student> list2 = dao.getStudents();
		System.out.println("Output from getStudents() method:");
		/*for(Student stu : list2)
		{*/
			/*System.out.println(stu.getId()+" "+stu.getName()+" "+stu.getBranch()+" "+stu.getAddress()+" "+stu.getEmail()+" "+stu.getPhoneno());
			*/
			
			 if (!list2.isEmpty()) {
		            Student lastValue = list2.get(list2.size() - 1);
		            System.out.println("Last value: " + lastValue);
		        } else {
		            System.out.println("The list is empty.");
		        }
		
		System.out.println("Retrieved Successfully!");
	
	}
}
