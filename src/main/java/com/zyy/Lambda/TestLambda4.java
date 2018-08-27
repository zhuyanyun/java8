package com.zyy.Lambda;

/**
 * @Description TODO  java8内置的四大核心函数式接口
 * @Author zhuyanyun
 * @Date 2018/8/27 上午8:58
 * @Vertion 1.0
 **/

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * TODO Consumer<T>: 消费型接口
 *             void accept(T t)
 *
 * TODO Supplier<T>: 供给型接口
 *             T get();
 *
 * TODO Function<T, R>: 函数型接口
 *             R apply(T t);
 *
 * TODO Predicate<T>: 断言型接口
 *             boolean test(T t);
 */
public class TestLambda4 {

    //consumer<T>    消费型接口
    @Test
    public void test1(){
        happy(100000, (m) -> System.out.println("每次消费" + m));
    }

    @Test
    public void test2(){
        List<Integer> numList = getNumList(10, () -> (int) (Math.random() * 100) );

        for(Integer num : numList){
            System.out.println(num);
        }
    }

    @Test
    public void test3(){
        String newStr = strHandle("厉害了我的哥", (str) -> str.substring(1,3));
        System.out.println(newStr);
    }

    //断言型接口

    //需求 ：用于处理字符串
    public String strHandle(String str, Function<String, String> fun){
        return fun.apply(str);
    }

    //需求：产生指定个数的整数，并放入集合中
    public List<Integer> getNumList(int num, Supplier<Integer> sup){
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < num; i++){
            Integer n = sup.get();
            list.add(n);
        }
        return list;
    }

    public void happy(double money,Consumer<Double> con){
        con.accept(money);
    }
}
