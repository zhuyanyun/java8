package thinkjava.chapter_11.map;

import java.util.HashMap;
import java.util.Random;

/**
 * Created by zyy on 19/8/25.
 */
public class Statistics {
    public static void main(String[] args) {
        Random random = new Random();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < 10000; i++){
            int r = random.nextInt(20);
            Integer freq = map.get(r);
            map.put(r, freq == null ? 1 : freq+1);
        }
        System.out.println(map);

        System.out.println(map.containsKey(5));
        System.out.println(map.containsValue(521));
    }
}
