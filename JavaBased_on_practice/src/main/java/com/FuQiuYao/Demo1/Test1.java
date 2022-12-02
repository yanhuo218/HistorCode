package com.FuQiuYao.Demo1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] d1 = new double[5];
        for (int i = 0; i < d1.length; i++) {
            System.out.println("请输入第" + (i+1) + "个数");
            d1[i] = sc.nextDouble();
        }
        for (double v : d1) {
            System.out.println(v);
        }
    }
}
