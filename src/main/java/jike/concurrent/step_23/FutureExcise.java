package jike.concurrent.step_23;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-05-31 09:32
 * @Vertion 1.0
 **/
public class FutureExcise {

    public static void main(String[] args) throws Exception {
        FutureTask<Integer> task
                = new FutureTask<>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int m = 1;
                for(int i=1;i <= 100000;i++){
                    int t =1;
                    m = t + i;
                }
                return m;
            }
        });

        ExecutorService es = Executors.newCachedThreadPool();

        es.submit(task);

        Integer integer = task.get();

        System.out.println(integer);


    }
}
