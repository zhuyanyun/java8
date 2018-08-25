package com.zyy.strategy;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2018/8/25 上午9:41
 * @Vertion 1.0
 **/
public class FilterEmployeeByAge implements MyPredicate<Employee> {

    public boolean test(Employee t) {
        return t.getAge() >= 35;
    }
}
