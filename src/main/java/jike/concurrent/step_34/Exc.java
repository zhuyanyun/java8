package jike.concurrent.step_34;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-06-10 16:19
 * @Vertion 1.0
 **/
public class Exc {

    public static void main(String[] args) {
        ExecutorService pool = Executors
                .newSingleThreadExecutor();
        pool.submit(() -> {
            try {
                String qq=pool.submit(()->"QQ").get();
                System.out.println(qq);
            } catch (Exception e) {
            }
        });

    }
}
