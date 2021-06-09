//CommandLineRunner 로 사용되지 않음

//package com.example.com.exam.app;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Component;
//
//@Component // 컨테이너 등록
//public class Frontend {
//
//    @Autowired
//    ArgumentResolver argumentResolver;
//    @Autowired
//    Calculator calculator;
//
//    public void run() {
//        System.out.println("Enter 2 number like 'a, b' : ");
//        Argument argument = argumentResolver.resolve(System.in);
//        int result = calculator.calc(argument.getA(), argument.getB());
//        System.out.println("result = " + result);
//    }
//}
