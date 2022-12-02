package com.FuQiuYao.Demo4;

public class Cat {
    private String name;
    private Integer age;

    private String color;

    public Cat() {
    }

    public Cat(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "第X只猫:{" +
                "名字='" + name + '\'' +
                ", 年龄='" + age + '\'' +
                ", 颜色='" + color + '\'' +
                '}';
    }
}
