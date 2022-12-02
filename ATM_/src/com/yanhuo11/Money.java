package com.yanhuo11;

public class Money {
    private String name;
    private double money;


    public Money() {
    }

    public Money(String name, double money) {
        this.name = name;
        this.money = money;
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

    public void getM(double i) {
        if (i<=this.money){//同时取钱，线程安全问题
            String a = Thread.currentThread().getName();
            System.out.println(a + "取钱成功，取了:" + i + "元" );
            this.money = this.money - i;
            System.out.println("余额:" + this.money);
        }else {
        }
    }
}
