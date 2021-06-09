package com.example.com.exam.app;

import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.Scanner;
@Component
public class ScannerArgumentResolver implements ArgumentResolver {

    @Override
    public Argument resolve(InputStream stream) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        return new Argument(a,b);
    }

}