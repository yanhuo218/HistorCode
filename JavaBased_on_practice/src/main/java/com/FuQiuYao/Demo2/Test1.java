package com.FuQiuYao.Demo2;

import java.util.Set;
import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {1,2,5,9,8,5,8,3,5,3};
        Set<Integer> ints = new TreeSet<>();
        for (int i : arr) {
            ints.add(i);
        }
        for (Integer anInt : ints) {
            System.out.print(anInt + " ");
        }
        System.out.println("\n---------------------------");
        int[] arr2 = {54,65,84,20,30,55,23,26,98,65,94};
        int min = 0,max = 0;
        for (int i : arr2) {
            if (i>50){
                System.out.print(i + " ");
            }else {
                max += i;
                min++;
            }
        }
        System.out.println("\n"+ max/min);
    }

}
