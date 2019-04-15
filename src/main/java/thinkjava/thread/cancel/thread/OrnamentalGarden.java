package thinkjava.thread.cancel.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static com.sun.deploy.trace.Trace.print;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-04-13 18:09
 * @Vertion 1.0
 **/
public class OrnamentalGarden {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0; i< 5; i++){
            exec.execute(new Entrance(i));
        }
        TimeUnit.SECONDS.sleep(3);
        Entrance.cancel();
        exec.shutdown();
        if(!exec.awaitTermination(250,TimeUnit.MILLISECONDS)){
            print("Some tasks were not terminated");
        }
        System.out.println("Total:" + Entrance.getTotalCount());
        System.out.println("Sum of Entrances" + Entrance.sumEntrances());
    }
}
