package com.example;

import com.example.ClassA;

public class ClassB {
    public void other() {
        ClassA ca = new ClassA();
        System.out.println("defaultNumber "+ca.defaultNumber);
        System.out.println("protectedNumber "+ca.protectedNumber);
        System.out.println("publicNumber "+ca.publicNumber);
        System.out.println("Calling method of A");
        ca.printAll();
    }
}
