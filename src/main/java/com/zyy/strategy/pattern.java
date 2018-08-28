package com.zyy.strategy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2018/8/25 上午9:15
 * @Vertion 1.0
 **/
public class pattern {

       List<Employee> employees = Arrays.asList(
            new Employee("张三", 18, 3333.33),
            new Employee("李四", 38, 5373.33),
            new Employee("王五", 50, 15373.33),
            new Employee("赵六", 25, 8373.33),
            new Employee("田七", 14, 1373.33)
    );

    @Test
    public void test3(){
        List<Employee> list = filterEmployees(this.employees);
        for(Employee employee: list){
            System.out.println(employee);
        }
    }


    //需求：获取当前公司中员工年龄大于35的员工信息
    public List<Employee> filterEmployees(List<Employee> list){
        List<Employee> emps = new ArrayList<Employee>();
        for(Employee emp : list){
            if(emp.getAge() >= 35){
                emps.add(emp);
            }
        }
        return emps;
    }

    //需求：获取当前公司中员工工资大于5000的员工信息
    public List<Employee> filterEmployees2(List<Employee> list){
        List<Employee> emps = new ArrayList<>();
        for(Employee emp : list){
            if(emp.getSalary() >= 5000){
                emps.add(emp);
            }
        }
        return emps;
    }

    //优化方式一: 策略设计模式
    @Test
    public void test4(){
        List<Employee> list = filterEmployee(employees, new FilterEmployeeByAge());

        for(Employee employee : list){
            System.out.println(employee);
        }

        System.out.println("---------------------------");

        List<Employee> list2 = filterEmployee(employees, new FilterEmployeeBySalary());

        for(Employee employee : list2){
            System.out.println(employee);
        }
    }


    public List<Employee> filterEmployee(List<Employee> list, MyPredicate<Employee> mp){
        List<Employee> emps = new ArrayList<Employee>();

        for(Employee employee : list){
            if(mp.test(employee)){
                emps.add(employee);
            }
        }
        return emps;
    }

    //优化方式二：匿名内部类
    @Test
    public void test5(){
        List<Employee> list = filterEmployee(employees, new MyPredicate<Employee>() {
            public boolean test(Employee employee) {
                return employee.getSalary() <= 5000;
            }
        });

        for(Employee employee : list){
            System.out.println(employee);
        }
    }

    //优化方式三：Lambda 表达式
    @Test
    public void test6(){
        List<Employee> list = filterEmployee(employees, (e) -> e.getSalary() <= 5000);
        list.forEach(System.out::println);
        System.out.println(list);
    }

    //优化方式四：Stream API
    @Test
    public void test7(){
        employees.stream()
                .filter((e) -> e.getSalary() >= 5000)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("---------------------");

        employees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);
    }


}
