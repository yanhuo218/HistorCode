package com.yanhuo10;

import java.io.File;
import java.util.Scanner;

public class FileDemo1 {//F:/网盘下载/百度网盘2
    public static int fileDel = 0;//删除的文件总数
    public static int folder = 0;//删除的文件夹总数

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的文件路径:\t\t注:'/'为路径分割符~注意中英文符号");
        String path = sc.next();
        String dot = null;
        try {
            dot = test1(path);   //E:/Users/付秋垚/Desktop/test.FileDelete  文件删除测试
            if (dot.equals("成功")){
                System.out.println("全部删除成功~共删除" + fileDel + "个文件," + folder + "文件夹");
            }else{
                System.out.println(dot + ":文件删除失败~请检查文件权限~");
                System.out.println("删除成功~共删除" + fileDel + "个文件," + folder + "文件夹");
            }
        } catch (Exception e) {
            System.out.println("请检查文件路径~");
        }
    }
    public static String test1(String file){
        if (file == null){
            return null;
        }
        File F1 = new File(file);
        String[] names = F1.list();
        for (String name : names) {
            File F2 = new File(file+"/"+name);
            if (F2.isDirectory()){
                if (!F2.delete()){
                    test1(file+"/"+name);
                }
                F2.delete();
                System.out.println("已删除文件夹:" + name);
                folder++;
            }else {
                if (!F2.delete()){
                    return name;
                }
                System.out.println("已删除文件:" + name);
                fileDel++;
            }

        }
        return "成功";
    }
}
