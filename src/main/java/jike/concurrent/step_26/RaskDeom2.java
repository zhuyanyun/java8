package jike.concurrent.step_26;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.TimeUnit;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-06-20 19:12
 * @Vertion 1.0
 **/
public class RaskDeom2 {

    public static void main(String[] args) throws InterruptedException {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.submit(new RaskDeom(0,1000));

        forkJoinPool.awaitTermination(1, TimeUnit.SECONDS);

        forkJoinPool.shutdown();
    }

    static class RaskDeom extends RecursiveAction{

        private static final int MAX = 20;

        private int start;
        private int end;

        public RaskDeom(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        protected void compute() {
            if((end - start) < MAX){
                for(int i = start; i< end; i++){
                    System.out.println(Thread.currentThread().getName() + "i的值" +i);
                }
            }else{
                int middle = (start + end)/2;
                RaskDeom left = new RaskDeom(start, middle);
                RaskDeom right = new RaskDeom(middle, end);
                left.fork();
                right.fork();
            }
        }
    }
}
