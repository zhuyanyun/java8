package thinkjava.chapter_13;

import java.util.Formatter;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-27 10:23
 * @Vertion 1.0
 **/
public class Conversion {
    public static void main(String[] args) {
        Formatter formatter = new Formatter(System.out);
        char u = 'a';
        System.out.println("u = 'a'");
        formatter.format("s: %s\n", u);
//        formatter.format("d: d%\n",u);
        formatter.format("c %c\n",u);
        formatter.format("b %b\n",u);
        formatter.format("h: %h\n",u);
    }
}
