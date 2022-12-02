package com.FuQiuYao.Demo1;

public class Test2 {
    public static void main(String[] args) {
        for (int i = 97;i<123;i++){
            System.out.print((char)(i) + " ");
        }
        System.out.println("");
        for (int i = 65;i<91;i++){
            System.out.print((char)(i) + " ");
        }
        System.out.println("");
        int[] x = new int[26];
        for (int i = 0; i < 26; i++) {
            x[i] = i+65;
        }
        for (int i : x) {
            System.out.print((char)(i+3) + " ");
        }
    }

}
