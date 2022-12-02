package com.yanhuo3;

public class Goldcard extends Card{

    @Override
    public void pay(double money) {
        System.out.println("您当前消费:" + money);
        System.out.println("您当前余额:" + getMoney());
        double paying =  money * 0.8;
        System.out.println(getUsersName()+"先生/女士~你本期预计支付:" + paying);
        if (paying < getMoney()){
            System.out.println("对不起，你的余额不足~请充值");
        }else{
            setMoney(getMoney() - paying);
            System.out.println("你的余额为:" + getMoney());
        }
    }
}
