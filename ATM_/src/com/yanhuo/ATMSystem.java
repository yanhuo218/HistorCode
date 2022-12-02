package com.yanhuo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("====================欢迎使用XXX ATM系统====================");
            System.out.println("1.账号登录");
            System.out.println("2.账号注册");
            System.out.println("3.账户查询");
            System.out.println("3.退出系统");
            int select = sc.nextInt(),x = 1;
            switch (select) {
                case 1 :
                    register(accounts, sc);
                case 2 :
                    Registration(accounts, sc);
                case 3 :
                    exit(accounts);
                case 4 :
                    x = -1;
                default :
                    System.out.println("请选择正确的选项~~");
            }
            if (x == -1){
                break;
            }
        }
    }

    public static void register(ArrayList<Account> accounts, Scanner sc) {
        int thisUsers;
        while (true) {
            System.out.print("请输入你的卡号:");
            int th = UsersFind(accounts, sc);
            if (th != -1) {
                thisUsers = th;
                break;
            } else {
                System.out.println("对不起，没有此卡~请重输入");
            }
        }
        Account account = accounts.get(thisUsers);
        while (true) {
            System.out.print("请输入你的密码:");
            String pass = sc.next();
            if (account.getPassword().equals(pass)) {
                break;
            } else {
                System.out.println("输入的密码错误~~重新输入~");
            }
        }
        while (true) {
            System.out.println("====================欢迎进入ATM操纵界面====================");
            System.out.println("1.查询");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.修改密码");
            System.out.println("6.退出");
            System.out.println("7.注销账户");
            int q = sc.nextInt();
            double sum, sums;
            boolean flag = false;
            switch (q) {
                case 1:
                    System.out.println("====================你的账户详细信息如下====================");
                    System.out.println("卡号:" + account.getCardNumber());
                    System.out.println("户主:" + account.getName());
                    System.out.println("余额:" + account.getRemainingSum());
                    System.out.println("提现额度:" + account.getLimit());
                    break;
                case 2:
                    while (true) {
                        System.out.print("请输入要存入的金额:");
                        sum = sc.nextDouble();
                        if (sum > 0) {
                            break;
                        }
                        System.out.println("金额有误~");
                    }
                    sums = account.getRemainingSum() + sum;
                    account.setRemainingSum(sums);
                    System.out.println("存款成功~");
                    break;
                case 3:
                    while (true) {
                        System.out.println("请输入要取出的金额:");
                        sum = sc.nextDouble();
                        if (sum > 0) {
                            break;
                        }
                        System.out.println("金额有误~");
                    }
                    sums = account.getRemainingSum() - sum;
                    account.setRemainingSum(sums);
                    System.out.println("取款成功~");
                    break;
                case 4:
                    int sideUsers;
                    while (true){
                        System.out.print("请输入对方用户卡号:");
                        int th = UsersFind(accounts, sc);
                        if (th != -1) {
                            sideUsers = th;
                            break;
                        } else {
                            System.out.println("对不起，没有此卡~请重新输入");
                        }
                    }
                    Account accountTwo = accounts.get(sideUsers);
                    while (true){
                        System.out.println("请输入要为对方转入多少金额~你的余额为:" + account.getRemainingSum());
                        double turnSum = sc.nextDouble();
                        if (turnSum >0 && turnSum < account.getRemainingSum()){
                            double sideSum = accountTwo.getRemainingSum() + turnSum;
                            accountTwo.setRemainingSum(sideSum);
                            double thisSum = account.getRemainingSum() - turnSum;
                            account.setRemainingSum(thisSum);
                            System.out.println("已成功办理转账~");
                            break;
                        }else {
                            System.out.println("输入的金额有误~");
                        }
                    }
                    break;
                case 5:
                    while (true){
                        System.out.println("请输入原账户密码~");
                        String pass = sc.next();
                        if (account.getPassword().equals(pass)){
                            while (true){
                                System.out.println("请输入新密码：");
                                String NewPass = sc.next();
                                System.out.println("请再次输入新密码:");
                                String NewPassTwo = sc.next();
                                if (NewPass.equals(NewPassTwo)){
                                    account.setPassword(NewPass);
                                    break;
                                }else {
                                    System.out.println("输入新密码有误，请重新输入~");
                                }
                            }
                            break;
                        }else{
                            System.out.println("输入密码错误~");
                        }
                    }
                    break;
                case 6:
                    flag = true;
                    break;
                case 7:
                    accounts.remove(thisUsers);
                    System.out.println("注销账户成功");
                    flag = true;
                    break;
                default:
                    System.out.println("选择有误请重新选择~");
            }
            if (flag) {
                break;
            }
        }
    }

    private static int UsersFind(ArrayList<Account> accounts, Scanner sc) {
        String card = sc.next();
        int x = -1;
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            if (account.getCardNumber().equals(card)) {
                x = i;
                break;
            }
        }
        return x;
    }


    //账户注册
    private static void Registration(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("====================欢迎进行开户操作====================");
        Account acc = new Account();
        System.out.println("请输入你的账户名称:");
        String name = sc.next();
        acc.setName(name);
        while (true) {
            System.out.println("请输入你的账号密码:");
            String passOne = sc.next();
            System.out.println("请再次输入你的账号密码:");
            String passTwo = sc.next();
            String card;
            if (passOne.equals(passTwo)) {
                acc.setPassword(passOne);
                while (true) {
                    card = Cards();
                    boolean flag = true;
                    for (Account account : accounts) {
                        if (account.getCardNumber().equals(card)) {
                            //卡号已存在
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        acc.setCardNumber(card);
                        break;
                    }
                }
                while (true) {
                    System.out.println("请输入你的可用额度:");
                    double limit = sc.nextDouble();
                    if (limit < 0) {
                        System.out.println("可用额度有误请重新输入~~");
                    } else {
                        acc.setLimit(limit);
                        break;
                    }
                }
                while (true) {
                    System.out.println("请输入开户存款金额:");
                    double sum = sc.nextDouble();
                    if (sum < 0) {
                        System.out.println("有误请重新输入~~");
                    } else {
                        acc.setRemainingSum(sum);
                        break;
                    }
                }
                System.out.println("恭喜你注册成功，你的卡号为:" + card);

                break;
            } else {
                System.out.println("输入密码有误~~请重新开始");
            }
        }
        accounts.add(acc);
    }

    public static String Cards() {
        String cards = "0123456789";
        StringBuilder card = new StringBuilder();
        Random ra = new Random();
        for (int i = 0; i < 10; i++) {
            int x = ra.nextInt(10);
            card.append(cards.charAt(x));
        }
        return card.toString();
    }

    private static void exit(ArrayList<Account> accounts) {
        for (Account acc : accounts) {
            System.out.println("卡号" + acc.getCardNumber());
            System.out.println("============");
        }
    }
}
