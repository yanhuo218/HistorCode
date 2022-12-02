package com.yanhuo8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamDome1 {
    public static double allMoney;
    public static void main(String[] args) {
        List<Employee> one = new ArrayList<>();
        one.add(new Employee("1","男",30000,25000,null));
        one.add(new Employee("2","男",25000 ,1000,"挨打"));
        one.add(new Employee("3","男",20000,20000,null));
        one.add(new Employee("4","男",20000,25000,null));

        List<Employee> two = new ArrayList<>();
        two.add(new Employee("one","男",15000,9000,null));
        two.add(new Employee("two","男",20000,10000,null));
        two.add(new Employee("three","男",50000,100000,"挨打"));
        two.add(new Employee("four","男",3500,1000,"挨打"));
        two.add(new Employee("five","男",20000,0,"挨打"));

        List<TopperFormer> Toppers =new ArrayList<>();
        Toppers.add(maxA(one));
        Toppers.get(0).setDepartment("部门1:");
        Toppers.add(maxA(two));
        Toppers.get(1).setDepartment("部门2:");
        System.out.println(Toppers);

        System.out.println("部门1的平均工资为:" + average(one.stream(),one.size()));
        System.out.println("部门2的平均工资为:" + average(two.stream(),two.size()));
        Stream<Employee> i = Stream.concat(one.stream(),two.stream());
        System.out.println("整体平均工资为" + average(i,one.size() + two.size()));
    }
    public static TopperFormer maxA(List<Employee> x){
        return  x.stream().max(Comparator.comparingDouble(o -> o.getSalary() + o.getBonus()))
                .map(o -> new TopperFormer( o.getName(),o.getBonus()+ o.getSalary(),"")).get();
    }
    public static double average(Stream<Employee> x ,int y){
        x.sorted(Comparator.comparingDouble(o -> o.getSalary() + o.getBonus())).skip(1).limit(y -2).forEach(o -> {
                allMoney += (o.getBonus() + o.getSalary());
        });
        return allMoney/(y-2);
    }
}
