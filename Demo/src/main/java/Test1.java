import java.io.FileInputStream;

public class Test1 {
    public static void main(String[] args)throws Exception{
        FileInputStream file = new FileInputStream("F:\\aa\\asda.txt");
        int i;
        while ((i = file.read()) != -1){
            System.out.print((char) i);
        }
    }
}
