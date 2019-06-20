package jike.concurrent.step_23;

import javafx.concurrent.Task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-05-30 21:32
 * @Vertion 1.0
 **/
public class ExecutorServiceTest {

    public static void main(String[] args) throws Exception {

        class Task2 implements Runnable {
            ResultTer r;

            // 通过构造函数传入 result
            Task2(ResultTer r) {
                this.r = r;
            }

            public void run() {
                // 可以操作 result
                String a = r.getA();
                r.setX(a+"+++++");
            }
        }

        ExecutorService executor = Executors.newFixedThreadPool(1);
        // 创建 Result 对象 r
        ResultTer r = new ResultTer();
        r.setA("aa");

        // 提交任务
        Future<ResultTer> future =
                executor.submit(new Task2(r), r);

        ResultTer fr = future.get();
        System.out.println("======"+fr.getX());

        // 下面等式成立
//        fr = r;
//        fr.getA() = a;
//        fr.getX() = x;


    }

}
