package com.zyy.option;

import com.zyy.strategy.Employee;
import org.junit.Test;

import java.util.Optional;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2018/9/5 下午7:39
 * @Vertion 1.0
 **/
public class TestOptional {
    /**
     * Optional : 容器类的常用方法
     * Optional.of(): 创建一个Optional实例
     * Optional.empty():创建一个空的Optional实例
     * Optional.ofNullable(T t): 若t不为null,创建Optional实例，否则创建空实例
     * isPresent() : 判断是否包含值
     * orElse(T t)  : 如果对象包含值，返回该值，否则返回t
     */

    @Test
    public void test4(){
        Optional<Employee> op = Optional.ofNullable(null);
//        if(op.isPresent()){
//            System.out.println(op.get());
//        }

        Employee emp = op.orElse(new Employee("张三", 22, 4567.46, Employee.Status.BUSY));
        System.out.println(emp);
    }

    @Test
    public void test3(){
//        Optional<Employee> op = Optional.ofNullable(new Employee());
//        System.out.println(op.get());
        Optional<Employee> op = Optional.ofNullable(null);
        System.out.println(op.get());
    }

    @Test
    public void test2(){
        Optional<Employee> op = Optional.empty();
        System.out.println(op.get());
    }


    @Test
    public void test1(){
        Optional<Employee> op = Optional.of(null);

        Employee emp = op.get();
        System.out.println(emp);
    }
}
