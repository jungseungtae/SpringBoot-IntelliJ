//ComponentScan 으로 사용되지 않음

//package com.example.com.exam;
//
//import com.example.com.exam.app.*;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration // config class 임을 컴파일러에게 전달
//public class AppConfig {
//
//    @Bean // DI 컨테이너가 관리할 메소드 설정, 싱글톤이 되고 컨테이너 별 인스턴스 한 개 생성
//    Calculator calculator() {
//        return new AddCalculator(); // 해당 생성자로 생성한 인스턴스는 DI 컨테이너가 싱글톤으로 관리함
//    }
//    @Bean
//    ArgumentResolver argumentResolver() {
//        return new ScannerArgumentResolver();
//    }
//    @Bean
//    Frontend frontend() {
//        return new Frontend();
//    }
//}
