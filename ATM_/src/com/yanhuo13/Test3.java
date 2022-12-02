package com.yanhuo13;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1.发送文件:");
            System.out.println("2.接收文件:");
            System.out.println("3.退出:");
            System.out.println("注:现不可发送文件夹");
            switch (sc.next()){
                case "1":
                    String f1 = sc.next();
                    Send(f1);
                    break;
                case "2":
                    String f2 = sc.next();
                    System.out.println(f2);
                    Receive(f2);
                    break;
                case "3":
                    System.exit(0);
                    break;
                default:

            }
            System.out.println("------------------------");
        }
    }
    public static void Send(String file) throws Exception{
        DatagramSocket socket = new DatagramSocket();
        byte[] by = new  byte[64512];
        InputStream is = new FileInputStream("E:\\Users\\付秋垚\\桌面\\bb.exe");
        int len;
        while ((len = is.read(by)) != -1){
            DatagramPacket packet = new DatagramPacket(by,len, InetAddress.getLocalHost(),8888);
            socket.send(packet);
            System.out.println(len);
        }
        socket.close();
        is.close();
        System.out.println("文件发送成功");
    }
    public static void Receive(String file) throws Exception{
        DatagramSocket socket = new DatagramSocket(8888);
        byte[] by = new byte[64512];
        OutputStream os = new FileOutputStream("F:\\安装包\\yuanshen_setup_20220426165919.exe");
        int len;
        while (true) {
            DatagramPacket packet = new DatagramPacket(by,by.length);
            socket.receive(packet);
            len = packet.getLength();
            System.out.println(len);
            os.write(by,0,len);
            if (len < 64511){
                break;
            }
        }
        socket.close();
        os.close();
        System.out.println("文件接收成功");
    }
}
