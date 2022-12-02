package Demo7;

import java.util.Scanner;

public class Test2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String email = "QQEmail(FQY):2187895499@qq.com";
        String i = sc.next();
        int sum = email.indexOf(i);
        if (sum != -1 && i.length()>1){
            System.out.println("字符串在==>  " +(sum+1) +"<--->" + (i.length() + sum) + " 位");
        }else if(sum != -1 && i.length()==1){
            System.out.println("字符串在==>  " +(sum+1) + " 位");
        }else {
            System.out.println("字符串不存在");
        }

    }
}
