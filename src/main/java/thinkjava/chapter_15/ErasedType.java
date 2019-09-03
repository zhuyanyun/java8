package thinkjava.chapter_15;

import java.util.ArrayList;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-09-03 17:35
 * @Vertion 1.0
 **/
public class ErasedType {
    public static void main(String[] args) {
        Class aClass = new ArrayList<String>().getClass();
        Class bClass = new ArrayList<Integer>().getClass();
        System.out.println(aClass);
        System.out.println(aClass == bClass);
    }
}
