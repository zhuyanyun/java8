package com.zyy.stream;

import com.zyy.strategy.Employee;
import org.junit.Test;

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

}
