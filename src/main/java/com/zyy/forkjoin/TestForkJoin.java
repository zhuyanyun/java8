package com.zyy.forkjoin;

import org.junit.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2018/9/5 上午9:56
 * @Vertion 1.0
 **/
public class TestForkJoin {

    /**
     * forkjoin框架
     */
    @Test
    public void test1(){
        Instant start = Instant.now();

        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<Long> task = new ForkJoinCalculate(0, 100000000000L);
        Long sum = pool.invoke(task);
        System.out.println(sum);

        Instant end = Instant.now();
        System.out.println("耗时"+Duration.between(start, end).toMillis());  //28207
    }

    /**
     * 普通for
     */
    @Test
    public void test2(){
        Instant start = Instant.now();

        long sum = 0;
        for (long i = 0; i <= 1000000000000L; i++){
            sum += i;
        }

        System.out.println(sum);
        Instant end  = Instant.now();
        System.out.println("耗时"+Duration.between(start, end).toMillis()); //3263  --耗时332665
    }

    /**
     * java8 并行流
     */
    @Test
    public void test3(){
        Instant start = Instant.now();

        LongStream.rangeClosed(0,80000000000L)
                .parallel()    //并行流
                .reduce(0,Long::sum);

        Instant end = Instant.now();

        System.out.println("耗时"+Duration.between(start, end).toMillis());

    }
}
