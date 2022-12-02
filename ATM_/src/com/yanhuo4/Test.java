package com.yanhuo4;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer("G3");
        computer.run();

        USB u = new KeyBoard("雷神");
        computer.installUSB(u);
        USB u1 = new Mouse("雷蛇");
        computer.installUSB(u1);
    }
}
