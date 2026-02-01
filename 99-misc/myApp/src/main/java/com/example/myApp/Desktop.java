package com.example.myApp;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    public void compile(){

        System.out.println("Compiling 404 bugs faster!");
    }
}
