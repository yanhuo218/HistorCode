package Demo3;

import java.io.FileReader;
import java.util.Properties;

public class Test1 {
    public static void main(String[] args) throws Exception {
        Properties pro =  new Properties();
        FileReader rea = new FileReader("D:\\java\\IdeaProjects\\Demo\\src\\main\\java\\aaa.txt");
        pro.load(rea);
//        pro.clear();
        System.out.println(pro);
        String  count = pro.getProperty("count");
        System.out.println(count);
    }
}
