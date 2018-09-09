package com.zyy.time;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by zyy on 18/9/9.
 *
 * TODO 传统的日期存在日期多线程安全
 */
public class TestSimpleDateFormat {
    public static void main(String[] args) throws Exception{
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

        Callable<Date> task = new Callable<Date>() {

            @Override
            public Date call() throws Exception {
//                return sdf.parse("20161218");
                return DateFormatThreadLocal.convert("20161225");
            }
        };

        ExecutorService pool = Executors.newFixedThreadPool(10);

        List<Future<Date>> results = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            results.add(pool.submit(task));
        }

        for(Future<Date> future : results){
                System.out.println(future.get());

        }

    }
}
