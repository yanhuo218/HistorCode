package Test_demo;

public class Demo1 {
    public static void main(String[] args) {
        //逢7过
       /* for (int i = 0; i < 100; i++) {
            if ((i % 10 == 7) || (i % 7 == 0) || ((i / 10) % 10 == 7)) {
                System.out.println("过");
            }else {
                System.out.println(i);
            }
        }*/
        //不死神兔(斐波那契数列)
       /* int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;
        for (int i =2;i<arr.length;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        for (int i = 0;i< arr.length;i++){
            System.out.println(arr[i]);
        }*/
        //百鸡百钱
        /*for (int i= 0;i<=20;i++){
            for (int j = 0; j <= 33; j++) {
                int z = 100-i-j;
                if (z %3 == 0 && 5*i+3*j+z/3==100){
                    System.out.println("鸡翁" + i);
                    System.out.println("鸡母" + j);
                    System.out.println("鸡雏" + z);
                }
            }
        }*/
        //
    }
}
