package com.example.com.exam.app;

import java.io.InputStream;

public interface ArgumentResolver {

    Argument resolve(InputStream stream);
}
