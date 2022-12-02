package Demo7;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Test4 {
    public static Random re = new Random();
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("FQYQQEmail:2187895499@qq.com");
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
