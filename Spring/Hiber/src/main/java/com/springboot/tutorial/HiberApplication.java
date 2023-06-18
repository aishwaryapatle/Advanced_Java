package com.springboot.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springboot.tutorial.model.Employee;
import com.springboot.tutorial.model.EmployeeDao;

@SpringBootApplication
public class HiberApplication {

	public static void main(String[] args) {
//		SpringApplication.run(HiberApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		EmployeeDao dao = (EmployeeDao) context.getBean("d");

		Employee e = new Employee();
		e.setId(105);
		e.setName("Aishwarya");
		e.setSalary(40000);

//		dao.updateEmployee(e);;
		dao.saveEmployee(e);
		
		
		System.out.println("Data inserted !");
	}

}
