package thinkjava.chapter_2;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-14 17:36
 * @Vertion 1.0
 **/
public class Test {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(2);
        System.out.println(new Date());
        System.getProperties().list(System.out);

        System.out.println(System.getProperty("user.name"));

        System.out.println(System.getProperty("java.library.path"));
    }
}
