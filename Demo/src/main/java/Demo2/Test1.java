package Demo2;

import java.util.Scanner;

public class Test1 {
    private static final Customer customer = new Customer();
    static {
        customer.setJaneSmith("JaneSmith");
        customer.setX(2000);
    }
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println(customer.getJaneSmith()+"先生,请输入需要存入的金额:");
            int y = sc.nextInt();
            if (y == 0){
                break;
            }
            customer.setX(customer.getX()+y);
            System.out.println("存入了:" + y + "元" + "余额为:" + customer.getX());
            System.out.println("请输入需要取出的金额:");
            int t = sc.nextInt();
            customer.setX(customer.getX() - t);
            System.out.println("取出了:" + t + "元");
        }
    }

}
