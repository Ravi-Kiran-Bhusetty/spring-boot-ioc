package com.learn.springbootioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootIocApplication {

	public static void main(String[] args) {

		// Using this context we get the objects from IoC container
		ApplicationContext context =  SpringApplication.run(SpringBootIocApplication.class, args);

		// User object would be present in IoC container because it is annotated with @Component
		User user = context.getBean(User.class);
		user.getUserName();

		// Admin object would NOT be present in IoC container because it is not annotated with @Component
		Admin admin = context.getBean(Admin.class);
		admin.getAdminName();

	}

}
