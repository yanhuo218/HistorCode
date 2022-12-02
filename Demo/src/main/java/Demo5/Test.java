package Demo5;

public class Test {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("张三");
        Taxi taxi = new Taxi("jj公司");
        sedan.start();
        taxi.stop();
        System.out.println("======================");
        sedan.setNum("AAA");
        System.out.print("我叫"+sedan.getName() + ",我的");
        sedan.start();
        System.out.print("我叫"+sedan.getName() + "我到家了,所以");
        sedan.stop();
        System.out.println("======================");
        taxi.setNum("BBB");
        System.out.print("我是" + taxi.getCompany() + "的出租车,");
        taxi.start();
        System.out.print("我是" + taxi.getCompany() + "的出租车,因为乘客送到了所以");
        taxi.stop();
    }
}
