package com.yanhuo13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Test2 {
    public static void main(String[] args) throws Exception  {
        DatagramSocket socket = new DatagramSocket(8888);
        byte[] by = new  byte[1024*63];
        OutputStream os = new FileOutputStream("E:\\Users\\付秋垚\\桌面\\bb.exe");
        while (true) {
            try {
                DatagramPacket packet = new DatagramPacket(by,by.length);
                socket.receive(packet);
                int len = packet.getLength();
                os.write(by,0,len);
                if (len < 1024*63){
                    break;
                }
            } catch (IOException e) {
                break;
            }
        }
        os.close();
        socket.close();
        System.out.println("文件接收成功");
    }
}
