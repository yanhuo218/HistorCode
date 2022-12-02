package com.yanhuo6;

import java.util.HashSet;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        Set<Student> sets = new HashSet<>();
        Student s1 = new Student("one",12, '男');
        Student s2 = new Student("two",13, '男');
        Student s3 = new Student("three",12, '男');
        Student s4 = new Student("one",12, '男');
        sets.add(s1);
        sets.add(s2);
        sets.add(s3);
        sets.add(s4);
        System.out.println(sets);
    }
}
