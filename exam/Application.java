package com.example.com.exam;

import com.example.com.exam.app.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Scanner;

@EnableAutoConfiguration
@ComponentScan
public class Application implements CommandLineRunner { // Frontend class 의 run 메소드 역할을 수행하는 인터페이스 상속

	@Autowired
	ArgumentResolver argumentResolver;
	@Autowired
	Calculator calculator;

	@Override
	public void run(String...strings) throws Exception {
		System.out.println("Enter 2 number like 'a b' : ");
		Argument argument = argumentResolver.resolve(System.in);
		int result = calculator.calc(argument.getA(), argument.getB());
		System.out.println("result = " + result);
	}

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

//		외부 클래스로 분리되어 사용하지 않음
//		try(ConfigurableApplicationContext context = SpringApplication.run(Application.class, args)) {
//			Scanner scanner = new Scanner(System.in);
//			System.out.println("Enter 2 number like 'a,b' : ");
//			int a = scanner.nextInt();
//			int b = scanner.nextInt();
//
//			Calculator calculator = context.getBean(Calculator.class);
//			int result = calculator.calc(a,b);
//			System.out.println("result = " + result);
//		}


//		ArgumentResolver argumentResolver = context.getBean(ArgumentResolver.class);
//		Argument argument = argumentResolver.resolve(System.in);
//		int result = calculator.calc(argument.getA(), argument.getB());

//		Autowired, DI
//		Frontend frontend = context.getBean(Frontend.class);
//		frontend.run();

	}
}