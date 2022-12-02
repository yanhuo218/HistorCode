package com.FuQiuYao.Demo1;


public class Test4 {
    public static void main(String[] args) {
        int[] arr1 = {12,87,64};
        int[] clone = arr1.clone();
        System.out.println(arr1);
        System.out.println(clone);
        for (int i : clone) {
            System.out.println(i);
        }
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        for (int i : arr2) {
            System.out.println(i);
        }
    }
}
