package com.springboot.demo;

public class Demo {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Demo() {
        System.out.println("Demo init");
    }
}
