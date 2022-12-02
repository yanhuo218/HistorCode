package com.yanhuo11;

public class Demo1 {
    public static void main(String[] args) {
        Money acc = new Money("aa",100000.0);
        //1线程
        new GetMoney(acc,"one").start();
        //2线程
        new GetMoney(acc,"two").start();
    }
}
