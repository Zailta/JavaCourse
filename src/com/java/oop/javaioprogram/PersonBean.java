package com.java.oop.javaioprogram;

public class PersonBean {
    private String name;
    private  int age;
    private String address;

    public PersonBean(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public PersonBean(){}
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "PersonBean{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
