package com.yanhuo8;

public class TopperFormer {
    private String name;
    private double money;
    private String department;

    public TopperFormer() {
    }

    public TopperFormer(String name, double money, String department) {
        this.name = name;
        this.money = money;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return department + "优秀员工:" + name + "\t工资为:" + money;
    }
}
