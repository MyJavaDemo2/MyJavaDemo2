package com.cykj.bean;

public class OrmTestBean {

    private String name;

    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String fetchName(String name){
        System.out.println("====="+name);
        return  this.name;
    }
}
