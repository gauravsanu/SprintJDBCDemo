package com.telusko.SpringJDBCDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.telusko.SpringJDBCDemo.model.Alien;
import com.telusko.SpringJDBCDemo.repo.AlienRepo;

@SpringBootApplication
public class DemoProjectForSpringBootApplication{

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(DemoProjectForSpringBootApplication.class, args);
		Alien alien1 = context.getBean(Alien.class);
		alien1.setId(1000);
		alien1.setName("Gaurav");
		alien1.setTech("PHP");
		
		AlienRepo repo = context.getBean(AlienRepo.class);
		repo.save(alien1);
		System.out.println(repo.findAll());
		
	}

}
