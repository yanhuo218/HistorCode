package passlx;

import main.java.org.mindrot.BCrypt;

public class Test {

    public static void main(String[] args) {

        String gensalt = BCrypt.gensalt();//这个是盐  29个字符，随机生成
        System.out.println(gensalt);
        String password = BCrypt.hashpw("123456", gensalt);  //根据盐对密码进行加密
        System.out.println(password);//加密后的字符串前29位就是盐

        //校验密码
        boolean abc = BCrypt.checkpw("123456", password);
        System.out.println(abc);

    }
}
