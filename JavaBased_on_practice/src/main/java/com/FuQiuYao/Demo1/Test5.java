package com.FuQiuYao.Demo1;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        for (int i = 0; i <= (arr.length-1)/ 2; i++) {
            int x = arr[i];
            arr[i] = arr[arr.length-(i+1)];
            arr[arr.length-(i+1)] =x;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
