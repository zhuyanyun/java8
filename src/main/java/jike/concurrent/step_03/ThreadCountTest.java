package jike.concurrent.step_03;

/**
 * Created by zyy on 19/6/15.
 */
public class ThreadCountTest {

    private volatile Long count = 0L;
    private  void add(){
        int add = 0;
        while (add++<10000){
            count ++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadCountTest threadCountTest = new ThreadCountTest();
        Thread thread1 = new Thread(()->{
            threadCountTest.add();
        });
        Thread thread2 = new Thread(() -> {
            threadCountTest.add();
        });
        //开启两个线程
        thread1.start();
        thread2.start();
        //等待两个线程结束
        thread1.join();
        thread2.join();

        System.out.println(threadCountTest.count);
    }

    public static Long calc() throws InterruptedException {
        ThreadCountTest threadCountTest = new ThreadCountTest();
        Thread thread1 = new Thread(()->{
            threadCountTest.add();
        });
        Thread thread2 = new Thread(() -> {
            threadCountTest.add();
        });
        //开启两个线程
        thread1.start();
        thread2.start();
        //等待两个线程结束
        /*thread1.join();
        thread2.join();*/

        return threadCountTest.count;
    }

}
