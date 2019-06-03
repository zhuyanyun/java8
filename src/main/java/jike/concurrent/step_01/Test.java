package jike.concurrent.step_01;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-05-08 19:16
 * @Vertion 1.0
 **/
public class Test {

    private long count = 0;

    private void add10K() {
        int idx = 0;
        while(idx++ < 50000) {
            count += 1;
        }
        System.out.println("&&&" + count);
    }

    public long calc() throws Exception {
        final Test test = new Test();
        // 创建两个线程，执行 add() 操作
        Thread th1 = new Thread(()->{
            test.add10K();
        });
        Thread th2 = new Thread(()->{
            test.add10K();
        });
        // 启动两个线程
        th1.start();
        th2.start();
        // 等待两个线程执行结束
        th1.join();
        th2.join();
        return count;
    }
}
