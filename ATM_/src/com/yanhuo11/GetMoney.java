package com.yanhuo11;

public class GetMoney extends Thread{
    private Money acc;
    public GetMoney(Money acc,String name){
        super(name);
        this.acc = acc;
    }
    @Override
    public void run() {
        acc.getM(100000.0);
    }
}
