package com.yanhuo10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileDome2 {
    public static void main(String[] args) throws IOException {
        InputStream f1 = new FileInputStream("C:\\Users\\付秋垚\\IdeaProjects\\ATM_\\src\\test1");
        byte[] x = new byte[3];
        int read;
        while ((read = f1.read(x))>0){
            System.out.print(new String(x,0,read));
        }
    }
}
