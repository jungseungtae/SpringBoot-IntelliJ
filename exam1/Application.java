package com.example.com.exam1;

import com.example.com.exam1.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.com.exam1.service.CustomerService;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	CustomerService customerService;

	@Override
	public void run(String... strings) throws Exception {
		//Insert
		customerService.save(new Customer(1,"승태","정"));
		customerService.save(new Customer(2,"길동","홍"));
		customerService.save(new Customer(3,"길동","고"));

		//Select
		customerService.findAll().forEach(System.out::println);
	}

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

}
