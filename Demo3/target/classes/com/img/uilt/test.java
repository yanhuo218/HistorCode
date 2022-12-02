package com.img.uilt;

public class test {
    public static void main(String[] args) {
        String name  = "lol英雄联盟疾风剑豪 神龙尊者 亚索4k游戏壁纸_彼岸图网.jpg";
        int i = name.lastIndexOf(".");
        StringBuilder a = new StringBuilder();
        for (int j = 30; j < name.length(); j++) {
            a.append(name.charAt(j));
        }
        System.out.println(i);
        System.out.println(a);
    }
}
