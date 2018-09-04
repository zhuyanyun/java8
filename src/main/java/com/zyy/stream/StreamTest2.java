package com.zyy.stream;

import com.zyy.strategy.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2018/8/28 上午8:59
 * @Vertion 1.0
 **/
public class StreamTest2 {

    List<Employee> employees = Arrays.asList(
            new Employee("张三", 18, 3333.33),
            new Employee("李四", 38, 5373.33),
            new Employee("王五", 50, 15373.33),
            new Employee("赵六", 25, 2373.33),
            new Employee("田七", 14, 8373.33),
            new Employee("田七", 14, 8373.33),
            new Employee("田七", 14, 8373.33)
    );

    /**
     * 筛选与切片
     * filter
     * limit
     * skip ---仍掉前n个流的元素
     * distinct
     */


    //内部迭代 ：迭代操作由Stream API 完成
    @Test
    public void test1(){
        //中间操作：不会执行任何操作
        Stream<Employee> stream = employees.stream()
                .filter(e -> {
                    System.out.println("Stream 中间操作");
                    return e.getAge() > 35;
                });

        //终止操作：一次性执行全部内容，即"惰性求值"
        stream.forEach(System.out::println);
    }

    //外部迭代
    @Test
    public void test2(){
        Iterator<Employee> iterator = employees.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test3(){
        employees.stream()
                .filter((e) -> {
                    System.out.println("短路！");
                    return  e.getSalary() > 2500;
                })
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    public void test4(){
        employees.stream()
                .filter((e) -> e.getSalary() > 2500)
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    public void test5(){
        employees.stream()
                .filter((e) -> e.getSalary() > 2500)
                .skip(2)
                .distinct()
                .forEach(System.out::println);
    }

    /**
     * 映射
     *      map --接收Lambda,将元素转换成其他形式或提取信息。接收一个函数作为参数，该函数会被应用到每个元素上，
     *      并将其映射成一个新的元素。
     *      flatMap -- 接收一个函数作为参数，将流中的每个值都换成另一个流，然后把所有流连接成一个流
     *
     */

    @Test
    public void test6(){
        List<String> list = Arrays.asList("aaa", "bbb", "ccc");
        list.stream()
                .map((str) -> str.toUpperCase())
                .forEach(System.out::println);


        System.out.println("--------------------");
        employees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);

        System.out.println("---------------------");

//        Stream<Stream<Character>> stream = list.stream()
//                .map(StreamTest2::filterCharater);
//        stream.forEach((sm) -> sm.forEach(System.out::println));

        System.out.println("-------------------");

        Stream<Character> sm = list.stream()
                .flatMap(StreamTest2::filterCharater);
        sm.forEach(System.out::println);

    }


    public static Stream<Character> filterCharater(String str){
        ArrayList<Character> list = new ArrayList<>();
        for(Character ch : str.toCharArray()){
            list.add(ch);
        }

        return list.stream();
    }


    @Test
    public void test7(){
        List<String> list = Arrays.asList("aaa", "bbb", "ccc");

        List list2 = new ArrayList<>();

        list2.add(11);
        list2.add(22);
//        list2.add(list);
        list2.addAll(list);

        System.out.println(list2);
    }

    /**
     * 排序
     *      sorted()  --自然排序（Comparable)
     *      sorted(Comparator com)  --定制排序（Comparator)
     */
    @Test
    public void test8(){
        List<String> list = Arrays.asList("ccc", "bbb", "aaa");
        list.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("------------------");

        employees.stream()
                .sorted((e1, e2) -> {
                    if(e1.getAge().equals(e2.getAge())){
                        return e1.getName().compareTo(e2.getName());
                    }else {
                        return -e1.getAge().compareTo(e2.getAge());
                    }
                }).forEach(System.out::println);

    }


}
