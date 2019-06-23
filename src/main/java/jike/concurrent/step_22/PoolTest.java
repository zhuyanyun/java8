package jike.concurrent.step_22;

import javax.rmi.CORBA.Util;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-06-18 10:09
 * @Vertion 1.0
 **/
public class PoolTest {

    public static void main(String[] args) {
        RejectedExecutionHandler handler = new RejectedExecutionHandler() {
            @Override
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            }
        };
        ReNameThreadFactory threadFactory = new ReNameThreadFactory("zyy");
        ArrayBlockingQueue blockingQueue = new ArrayBlockingQueue<Integer>(100);
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
                5, 20,
                10, TimeUnit.SECONDS,
                blockingQueue,threadFactory,
                handler
        );

        poolExecutor.execute(()->{
            System.out.println("=====");

        });
    }


}
