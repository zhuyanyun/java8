package thinkjava.thread.interrupt;

import java.util.concurrent.TimeUnit;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-04-28 15:39
 * @Vertion 1.0
 **/
public class SleepBlocked implements Runnable {

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
//            e.printStackTrace();
        }
        System.out.println("Exiting SleepBlocked.run()");
    }
}
