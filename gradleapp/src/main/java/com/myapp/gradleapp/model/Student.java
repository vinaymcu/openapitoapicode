package com.myapp.gradleapp.model;

public class Student {
    private String name;
    private String section;
    private String country;
    private int age;

    public Student(String name, String section, String country,int age) {
        super();
        this.name = name;
        this.section = section;
        this.country = country;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public String getSection() {
        return section;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", cls=" + section + ", country=" + country +",age ="+age +"]";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
