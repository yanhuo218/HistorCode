package com.yanhuo6;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo2 {
    public static void main(String[] args) {
        Set<Apple> sets = new TreeSet<>();
        sets.add(new Apple("1","red",9.9, 1000));
        sets.add(new Apple("2","green",7.9, 800));
        sets.add(new Apple("3","blue",10.9, 1200));
        sets.add(new Apple("4","baa",5.9, 600));
        System.out.println(sets);
    }
}
