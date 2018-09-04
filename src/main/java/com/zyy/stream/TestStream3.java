package com.zyy.stream;

import com.zyy.strategy.Employee;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2018/9/4 上午9:28
 * @Vertion 1.0
 **/
public class TestStream3 {

    List<Employee> employees = Arrays.asList(
            new Employee("张三", 18, 3333.33, Employee.Status.BUSY),
            new Employee("李四", 38, 5373.33, Employee.Status.FREE),
            new Employee("王五", 50, 15373.33, Employee.Status.VOCATION),
            new Employee("赵六", 25, 2373.33, Employee.Status.FREE),
            new Employee("田七", 14, 8373.33, Employee.Status.BUSY)
    );

    /**
     * TODO 查找和匹配
     * allMatch  -- 检查是否匹配所有元素
     * anyMatch  -- 检查是否至少匹配一个元素
     * noneMatch  -- 检查是否没有匹配所有元素
     * findFirst  --返回第一个元素
     * findAny    --返回当前流中的任意元素
     * count    --  返回流中元素的总个数
     * max
     * min
     */

    @Test
    public void test2(){
        long count = employees.stream().count();
        System.out.println(count);

        Optional<Employee> opt = employees.stream()
                .max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        System.out.println(opt.get());

        Optional<Double> opt2 = employees.stream()
                .map(Employee::getSalary)
                .min(Double::compare);
        System.out.println(opt2.get());

    }

    @Test
    public void test1(){
        boolean b = employees.stream()
                .allMatch((e) -> e.getStstus().equals(Employee.Status.BUSY));
        System.out.println(b);

        boolean b2 = employees.stream()
                .anyMatch((e) -> e.getStstus().equals(Employee.Status.BUSY));
        System.out.println(b2);

        boolean b3 = employees.stream()
                .noneMatch((e) -> e.getStstus().equals(Employee.Status.BUSY));
        System.out.println(b3);

        Optional<Employee> optional = employees.stream()
                .sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
                .findFirst();

        System.out.println(optional.get());

        Optional<Employee> any = employees.stream()
                .filter((e) -> e.getStstus().equals(Employee.Status.FREE))
                .findAny();
        System.out.println(any.get());
    }
}
