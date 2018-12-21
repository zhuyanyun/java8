package com.zyy.option;

import com.zyy.strategy.Employee;
import org.junit.Test;

import java.util.Optional;

/**
 * Created by zyy on 18/9/9.
 */
public class TestOptional2 {

    @Test
    public void test4(){
        Optional<Employee> op = Optional.ofNullable(new Employee("张三", 18, 5465D, Employee.Status.BUSY));

//        Optional<String> str = op.map((e) -> e.getName());
//        System.out.println(str.get());

        Optional<String> str2 = op.flatMap((e) -> Optional.of(e.getName()));
        System.out.println(str2.get());
    }
}
