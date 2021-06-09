package com.example.com.exam.app;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data // 각 필드의 세터/게터 등 메소드가 생성 됨. final은 세터가 생성되지 않음.
@RequiredArgsConstructor
public class Argument {

    private final int a;
    private final int b;
}
