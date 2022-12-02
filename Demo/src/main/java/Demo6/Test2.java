package Demo6;

public class Test2 {
    public static void main(String[] args) {
        MyData myData1 = new MyData("2022", "10", "20");
        MyData myData2 = new MyData("2022", "10", "20");
        MyData myData3 = new MyData("2004", "8", "8");
        System.out.println(myData1.equals(myData2));
        System.out.println(myData1.equals(myData3));
    }

}
