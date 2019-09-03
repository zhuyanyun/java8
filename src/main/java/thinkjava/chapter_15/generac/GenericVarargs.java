package thinkjava.chapter_15.generac;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-09-03 15:06
 * @Vertion 1.0
 **/
public class GenericVarargs {

    public static  <T> List<T> makeList(T... args){
        ArrayList<T> result = new ArrayList<>();
        for(T item : args){
            result.add(item);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> list = makeList("A");
        System.out.println(list);
        list = makeList("a", "b", "c");
        System.out.println(list);
        list = makeList("aagdfdfafasfasfasf".split(""));
        System.out.println(list);
    }
}
