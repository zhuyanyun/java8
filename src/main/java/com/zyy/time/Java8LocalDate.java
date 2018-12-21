package com.zyy.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by zyy on 18/9/9.
 */
public class Java8LocalDate {

    public static void main(String[] args) throws Exception {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");

        Callable<LocalDate> task = new Callable<LocalDate>() {

            @Override
            public LocalDate call() throws Exception {
//                return sdf.parse("20161218");
                return LocalDate.parse("20161225",dtf);
            }
        };

        ExecutorService pool = Executors.newFixedThreadPool(10);

        List<Future<LocalDate>> results = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            results.add(pool.submit(task));
        }

        for(Future<LocalDate> future : results){
            System.out.println(future.get());

        }
    }



}
