package thinkjava.chapter_11.test;

import java.util.*;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-23 20:05
 * @Vertion 1.0
 **/
public class PrintingContainers {
    static Collection fill(Collection<String> collection){
        collection.add("rat");
        collection.add("dog");
        collection.add("gug");

        collection.add("lug");
        collection.add("lug");
        return collection;
    }

    static Map fill(Map<String,String> map){
        map.put("rat","Fuzzy");
        map.put("dog","aaaa");
        map.put("lug","bbbbb");
        map.put("lug","cccc");
        return map;
    }

    public static void main(String[] args) {
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<>()));
        System.out.println(fill(new HashSet<>()));
        System.out.println(fill(new TreeSet<>()));
        System.out.println(fill(new LinkedHashSet<>()));
        System.out.println(fill(new HashMap<>()));
        System.out.println(fill(new TreeMap<>()));
        System.out.println(fill(new LinkedHashMap<>()));
    }
}
