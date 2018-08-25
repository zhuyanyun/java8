package com.zyy.Lambda;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @Description TODO  一,Lamber  表达式的基本语法：Java8中引入了一个新的操作符"->"该操作符称为箭头操作符或Lambda操作符
 *              TODO         箭头左侧参数类别（接口中的参数）， 箭头右侧操作表达式，抽象方法的实现
 * @Author zhuyanyun
 * @Date 2018/8/25 上午10:41
 * @Vertion 1.0
 **/

/*
 *  TODO 语法格式一：无参数，无返回值
 *      （）-> System.out.println("Hello Lambda!")
 */

public class TestLambda2 {

    int num = 0;   //jdk 1.7 前，必须是final  (现在默认)

    @Test
    public void test1(){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World" + num);
            }
        };

        r.run();

        System.out.println("--------------------");

        Runnable r1 = () -> System.out.println("Hello World");

        r1.run();
    }

    /*
     *TODO 语法格式二：有一个参数，并且无返回值 (只有一个参数，小括号可以不写，建议写)
     */

    @Test
    public void test2(){
        Consumer<String> con = (x) -> System.out.println(x);

        con.accept("zyy");
    }

    /*
     * TODO 语法格式三：有两个以上的参数，有返回值，并且Lambda中有多条语句,必须使用{}
     */
    @Test
    public void test3(){
        Comparator<Integer> com = (x, y) -> {
            System.out.println("函数式接口");
            return Integer.compare(x, y);
        };
    }

}
