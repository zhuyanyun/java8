package com.zyy.Lambda;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2018/8/27 下午12:51
 * @Vertion 1.0
 **/

import com.zyy.strategy.Employee;
import org.junit.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * TODO 一：方法引用：若Lambda 体中的内容有方法已经实现了，我们可以使用"方法引用"
 *          （可以理解为方法引用是 Lambda 表达式的另一种表现形式）
 *
 *只要有三种语法格式：
 *          TODO：lamdba体中调用方法的参数列表与返回值类型，要与函数式方法中抽象方法的参数列表和返回值类型保持一致！
 *
 * 对象：实例方法名
 *
 * 类：静态方法名
 *
 * 类：实例方法名
 *
 * TODO  二：构造器引用
 *
 * 注意：需要调用的构造器的参数列表要与函数式接口中抽象方法的参数列表保持一致
 *
 * TODO  三：数组引用
 *
 * Type :: new ;
 *
 */
public class TestMethodRef {

    @Test
    public void test7(){
        Function<Integer,String[]> fun = (x) -> new String[x];
        String[] strs = fun.apply(10);
        System.out.println(strs.length);

        Function<Integer,String[]> fun2 = String[]::new;
        String[] strings = fun2.apply(15);
        System.out.println(strings.length);

    }

    //构造器引用
    @Test
    public void test5(){
        Supplier<Employee> sup = () -> new Employee();

        //构造器引用方式   (调用无参构造器)
        Supplier<Employee> sup2 = Employee::new;
        Employee emp = sup2.get();
        System.out.println(emp);
    }

    @Test
    public void test6(){
        Function<Integer, Employee> fun = (x) -> new Employee(x);

        //调用有一个参数构造器
        Function<Integer, Employee> fun2 = Employee::new;
        Employee apply = fun2.apply(101);
        System.out.println(apply);

    }

    //类：实例方法名
    //TODO 若Lambda 参数列表中的第一个参数是 实例方法的调用者，而第二个参数是实例方法的参数时，可以使用ClassName:: method
    @Test
    public void test4(){
        BiPredicate<String,String> bp = (x, y) -> x.equals(y);

        BiPredicate<String, String> bp2 = String::equals;
    }


    //类：：静态方法名
    @Test
    public void tes3(){
        Comparator<Integer> com = (x,y) -> Integer.compare(x,y);

        Comparator<Integer> com1 = Integer::compare;
    }


    //对象实例方法
    @Test
    public void test(){
        Consumer<String> con = (x) -> System.out.println(x);

        PrintStream ps = System.out;
        Consumer<String> con1 = ps::println;

        Consumer<String> con2 = System.out::println;
        con2.accept("abcde");
    }

    @Test
    public void test2(){
        Employee emp = new Employee("kk",19,5000D);
        Supplier<String> sup = () -> emp.getName();
        String str = sup.get();
        System.out.println(str);

        Supplier<Integer> sup2 = emp::getAge;
        Integer num = sup2.get();
        System.out.println(num);

    }
}
