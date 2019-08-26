package thinkjava.chapter_11.test;

import com.alibaba.fastjson.JSONArray;

import java.util.*;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-23 19:50
 * @Vertion 1.0
 **/
public class AddingGroups {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        for(int i = 0;i<10;i++){
            integers.add(i);

        }
        System.out.println(JSONArray.toJSONString(integers));
    }
}
