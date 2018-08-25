package com.zyy.strategy;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2018/8/25 上午9:47
 * @Vertion 1.0
 **/
public class FilterEmployeeBySalary implements MyPredicate<Employee>{
    public boolean test(Employee employee) {
        return employee.getSalary() >= 5000;
    }
}
