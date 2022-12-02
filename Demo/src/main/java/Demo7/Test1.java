package Demo7;


import java.util.Random;
import java.util.Scanner;

public class Test1 {
    /*  QQEmail(FQY):2187895499@qq.com    */
    public static void main(String[] args) {
        String x = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm0123456789";
        Scanner sc = new Scanner(System.in);
        System.out.println("需要几位的随机字符:");
        int sum = sc.nextInt();
        char[] a = new char[sum];
        Random re = new Random();
        for (int i = 0; i < sum; i++) {
            a[i]= x.charAt(re.nextInt(x.length()));
        }
        System.out.println(String.valueOf(a));
    }
}
