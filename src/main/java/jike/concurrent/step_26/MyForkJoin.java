package jike.concurrent.step_26;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-06-20 09:37
 * @Vertion 1.0
 **/
public class MyForkJoin {


    public static void main(String[] args) {
        //创建分治线程池
        ForkJoinPool forkJoinPool = new ForkJoinPool(4);
        Fibonacci fibonacci = new Fibonacci(7);
        Integer result = forkJoinPool.invoke(fibonacci);

        System.out.println(result);
    }

    //递归任务
    static class Fibonacci extends RecursiveTask<Integer> {

        final int n;

        Fibonacci(int n){
            this.n = n;
        }

        @Override
        protected Integer compute() {

            if(n <= 1)
                return n;


            Fibonacci f1 = new Fibonacci(n - 1);

            f1.fork();

            Fibonacci f2 = new Fibonacci(n - 2);

//            f2.fork();

            System.out.println("线程:"+Thread.currentThread().getName()+"====="+n);

            return f2.compute() + f1.join();
        }
    }

}
