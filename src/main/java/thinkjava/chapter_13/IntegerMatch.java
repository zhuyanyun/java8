package thinkjava.chapter_13;

import org.multiverse.utils.SystemOut;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-27 11:04
 * @Vertion 1.0
 **/
public class IntegerMatch {
    public static void main(String[] args) {
        System.out.println("-1234".matches("-?\\d+"));
        System.out.println("5678".matches("-?\\d+"));
        System.out.println("+5678".matches("-?\\d+"));
        System.out.println("+5678".matches("(-|\\+)?\\d+"));
    }
}
