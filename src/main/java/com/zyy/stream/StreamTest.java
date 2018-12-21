package com.zyy.stream;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2018/8/27 下午4:21
 * @Vertion 1.0
 **/

import com.zyy.strategy.Employee;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * TODO 集合讲的是数据，流讲的是计算  【对原数据没有影响】
 * 1⃣️ ：Stream 自己不会存储元素
 * 2⃣️ ：Stream 不会改变源对象。相反，他们会返回一个持有结果的新Stream
 * 3⃣️ ：Stream 操作是延迟执行的。这意味着他们会等到需要结果的时候才执行。
 */
public class StreamTest {
    /**
     * 一，Stream 的三个操作步骤：
     * 1，创建Stream
     * 2,中间操作
     * 3，终止操作（终端操作）
     */

    //创建Stream
    @Test
    public void test1(){
        //1,可以通过Collection 系列集合提供的stream()[串行流] 或parallelStream()[并行流]
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();

        //2,通过Arrays中的静态方法stream（）获取数组
        Employee[] employees = new Employee[10];
        Stream<Employee> stream2 = Arrays.stream(employees);

        //3,通过Stream类中的静态方法of()
        Stream<String> stream3 = Stream.of("aaa", "bb", "cc");

        /**
         * 4,创建无限流
         */
        //迭代
        Stream<Integer> stream4 = Stream.iterate(0, (x) -> x + 2);
        stream4.limit(10).forEach(System.out::println);

        //生成
        Stream.generate(() -> Math.random())
                .limit(5)
                .forEach(System.out::println);



    }
}
