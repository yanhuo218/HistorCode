package Demo1;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sum = {1,5,4,8,7,6};
        System.out.println("请输入一个数字:");
        int x = sc.nextInt();
        for (int i = 0; i < sum.length; i++) {
            for (int y = i; y < sum.length; y++) {
                if ((sum[i]+sum[y]) == x){
                    System.out.println("[" + i + "," + y +"]");
                    break;
                }
            }
        }
    }

}
