package com.spr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BasicAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BasicAppApplication.class, args);
		System.out.println("Application is ready to use");
//		MyMessageService service = (MyMessageService)context.getBean(MyMessageService.class);
//		service.setMessage("I am ready");
//		System.out.println(service.getMessage());
//		Person person = (Person)context.getBean(Person.class);
//		person.show();
		Employee employee = (Employee)context.getBean(Employee.class);
		employee.show();
	}


}
