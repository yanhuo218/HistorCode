package com.yanhuo13;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Test1  {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        byte[] by = new  byte[1024*63];
        InputStream is = new FileInputStream("F:\\安装包\\yuanshen_setup_20220426165919.exe");
        int len;
        while ((len = is.read(by)) != -1){
            DatagramPacket packet = new DatagramPacket(by,len, InetAddress.getLocalHost(),8888);
            socket.send(packet);
        }
        socket.close();
        is.close();
        System.out.println("文件发送成功");
    }
}
