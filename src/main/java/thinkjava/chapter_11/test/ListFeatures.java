package thinkjava.chapter_11.test;

import com.alibaba.fastjson.JSONArray;
import sufa.array_05.Array;

import java.util.*;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-23 20:37
 * @Vertion 1.0
 **/
public class ListFeatures {
    public static void main(String[] args) {
        Random random = new Random(47);
//        Pets.arr
        List<Integer> integers = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 5,3));
        System.out.println(integers.indexOf(4));
        System.out.println(JSONArray.toJSONString(integers));

        List<Integer> s = integers.subList(1, 3);
        boolean b = integers.containsAll(s);
        System.out.println(b);
        System.out.println(JSONArray.toJSONString(s));
        Collections.sort(integers);
        System.out.println(JSONArray.toJSONString(integers));
        ArrayList<Integer> mm = new ArrayList<>();
        mm.add(1);
        mm.add(10);
        boolean b1 = integers.retainAll(mm);
        boolean empty = integers.isEmpty();
        integers.clear();
        Integer[] array = integers.toArray(new Integer[]{11, 12});
        System.out.println(JSONArray.toJSONString(array));
    }
}
