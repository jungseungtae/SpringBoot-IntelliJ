package com.example.com.exam1.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // 게터세터
@AllArgsConstructor // 롬복제공 모든 필드를 인자로 받는 생성자
@NoArgsConstructor
public class Customer {

    private  Integer id;
    private  String firstName;
    private  String lastName;
}
