import java.util.Random;
import java.util.Scanner;

public class yanzm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请需要几位的验证码:");
        int x = sc.nextInt();
        System.out.println("验证码为:" + yzm(x));
    }
    public static String yzm(int n){
        String c = "";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int x = r.nextInt(3);
            switch (x){
                case 0:
                    char ch = (char) (r.nextInt(26) + 65);
                    c += ch;
                    break;
                case 1:
                    char ch1 = (char) (r.nextInt(26) + 97);
                    c += ch1;
                    break;
                case 2:
                    c += r.nextInt(10);
                    break;
            }
        }

        return c;
    }
}
