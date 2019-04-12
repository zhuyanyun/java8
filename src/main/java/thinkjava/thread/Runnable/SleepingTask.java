package thinkjava.thread.Runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-04-10 15:23
 * @Vertion 1.0
 **/
public class SleepingTask extends LiftOff {

    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public SleepingTask(){}
    public SleepingTask(int countDown){
        this.countDown = countDown;
    }

    public String status(){
        return "#" + id + "(" +
                (countDown > 0 ? countDown : "Liftoff!") + "),";
    }
    @Override
    public void run() {
        while (countDown -- > 0){
            System.out.println(status());
//            Thread.yield();
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i =0; i<5; i++){
            exec.execute(new SleepingTask());
        }
        exec.shutdown();

    }
}
