package com.yanhuo12;

import java.util.Timer;
import java.util.TimerTask;

public class Test1 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("aa");
            }
        },3000,300);
    }
}
