package jike.concurrent.step_19;

import java.util.concurrent.CyclicBarrier;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-06-21 19:56
 * @Vertion 1.0
 **/
public class CycTest {

    static CyclicBarrier c = new CyclicBarrier(2, new A());

    public static void main(String[] args) {
        // 另外的子线程
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName() + ",19");
                    System.out.println(1);
                    c.await();
                } catch (Exception e) {
                }

            }
        }).start();

        // main线程
        try {
            System.out.println(Thread.currentThread().getName() + ",28");
            System.out.println(2);
            c.await();
        } catch (Exception e) {
        }

    }

    // 所有线程都到达时，最后一个到达的线程触发Runnable运行
    static class A implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ",run");
            System.out.println(3);
        }
    }
}
