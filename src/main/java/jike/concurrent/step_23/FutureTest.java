package jike.concurrent.step_23;

import jike.concurrent.step_22.ReNameThreadFactory;

import java.util.concurrent.*;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-05-30 20:59
 * @Vertion 1.0
 **/
public class FutureTest {

    public static void main(String[] args) throws Exception{
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor
                (5, 10, 100L, TimeUnit.SECONDS,
                        new LinkedBlockingDeque<Runnable>(5), new ReNameThreadFactory("zyy"), new ThreadPoolExecutor.AbortPolicy());


        Future future = threadPoolExecutor.submit(new Runnable() {
            @Override
            public void run() {

            }
        });
//        Object o = future.get();

        Future<Object> submit = threadPoolExecutor.submit(new Callable<Object>() {
            @Override
            public Object call() throws Exception {

                return null;
            }

        });
        Object o1 = submit.get();


        Future<Integer> submit2 = threadPoolExecutor.submit(new Runnable() {
            @Override
            public void run() {

            }
        }, new Integer(5));

        Integer integer = submit2.get();


        CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {

            }
        },threadPoolExecutor);
    }


}
