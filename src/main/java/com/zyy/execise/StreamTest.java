package com.zyy.execise;

import com.zyy.strategy.Employee;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2018/9/4 下午5:04
 * @Vertion 1.0
 **/
public class StreamTest {
    /**
     * 1,给定一个数字列表，如何返回一个由每个数的平方构成的列表呢？
     * 给定  【1，2，3，4，5】，  返回【1，4，5，25】
     */
    @Test
    public void test1(){
        Integer[] nums = new Integer[]{1,2,3,4,5};
        Arrays.stream(nums)
                .map((e) -> e * e)
                .forEach(System.out::println);
    }


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
     * 2; 怎样用map和reduce 方法数一数流中有多少个Employee呢？
     */
    @Test
    public void test2(){
        long count = employees.stream()
                .map((e) -> e.getSalary())
                .count();
        System.out.println(count);

        System.out.println("-----------");

        Optional<Integer> sum = employees.stream()
                .map((e) -> 1)
                .reduce(Integer::sum);
        System.out.println(sum.get());



    }

}
