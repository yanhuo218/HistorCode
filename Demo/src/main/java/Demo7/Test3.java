package Demo7;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Test3 {
    /*  QQEmail(FQY):2187895499@qq.com    */
    public static Random re = new Random();
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder(20);
        for (int i = 0; i < 20; i++) {
            String s = String.valueOf(re.nextInt(10));
            str.append(s);
        }
        System.out.println(str);
        Map<Object, Integer> m = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (m.containsKey(c)) {
                m.put(c,(m.get(c)+1));
            }else {
                m.put(c,1);
            }
        }
        System.out.println(m);
    }
}
