package com.FuQiuYao.Demo1;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {20,64,9,76,46,88,91,20};
        System.out.println("最大为:"+ Arrays.stream(arr).max());

    }

}
