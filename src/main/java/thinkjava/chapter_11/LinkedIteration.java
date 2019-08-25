package thinkjava.chapter_11;

import com.alibaba.fastjson.JSONArray;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by zyy on 19/8/24.
 */
public class LinkedIteration {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        System.out.println(list.getFirst());
        Integer integer = list.removeFirst();
        System.out.println(integer);
        System.out.println(list.size());

        list.addFirst(100);
        System.out.println(JSONArray.toJSONString(list));

    }
}
