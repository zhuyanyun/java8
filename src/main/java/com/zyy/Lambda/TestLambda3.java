package com.zyy.Lambda;

import com.zyy.execise.MyFunction;
import com.zyy.execise.MyFunction2;
import com.zyy.strategy.Employee;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
;
/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2018/8/27 上午8:35
 * @Vertion 1.0
 **/
public class TestLambda3 {

    List<Employee> employees = Arrays.asList(
            new Employee("张三", 18, 3333.33),
            new Employee("李四", 38, 5373.33),
            new Employee("王五", 50, 15373.33),
            new Employee("赵六", 25, 8373.33),
            new Employee("田七", 14, 1373.33)
    );

    @Test
    public void test1(){
        Collections.sort(employees, (e1, e2) -> {
            if(e1.getAge() == e2.getAge()){
                return e1.getName().compareTo(e2.getName());
            }else {
                return -Integer.compare(e1.getAge(), e2.getAge());
            }
        });

        for(Employee e :employees){
            System.out.println(e);
        }
    }

    @Test
    public void test2(){
        String strimStr = strHandler("\t\t\t   厉害了我的哥 ", (str) -> str.trim());
        System.out.println(strimStr);

        String upper = strHandler("abdcge", (str) -> str.toUpperCase());
        System.out.println(upper);

        String newStr = strHandler("厉害了我的哥", (str) -> str.substring(1,3));
        System.out.println(newStr);
    }

    @Test
    public void test3(){
        op(100L,200L,(x,y) -> x+y);

        op(100L,200L,(x,y) -> x*y);

    }


    //需求：用于处理字符串
    public String strHandler(String str, MyFunction mf){
       return mf.getValue(str);
    }

    public void op(Long m1, Long m2, MyFunction2<Long, Long> mf){
        System.out.println(mf.getValue(m1, m2));
    }

}
