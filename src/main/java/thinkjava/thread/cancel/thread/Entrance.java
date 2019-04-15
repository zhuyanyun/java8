package thinkjava.thread.cancel.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.sun.deploy.trace.Trace.print;


/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-04-13 17:29
 * @Vertion 1.0
 **/
public class Entrance implements Runnable {
    private static Count count = new Count();
    private static List<Entrance> entrances = new ArrayList<Entrance>();
    private int number = 0;
    private final int id;

    private static volatile boolean canceled = false;

    public static void cancel(){canceled = true;}

    public Entrance(int id) {
        this.id = id;
        entrances.add(this);
    }

    @Override
    public void run() {
        while (!canceled){
            synchronized (this){
                ++ number;
            }
            System.out.println(this + " Total:" + count.increment());

            try{
                TimeUnit.MILLISECONDS.sleep(100);
            }catch (InterruptedException e){
                print("sleep interrupted");
            }
        }
        System.out.println("Stopping " + this);
    }

    public synchronized int getValue(){return number;}

    public String toString(){
        return "Entrance" + id + ":" + getValue();
    }

    public static int getTotalCount(){
        return count.value();
    }

    public static int sumEntrances(){
        int sum = 0;
        for(Entrance entrance : entrances){
            sum += entrance.getValue();
        }
        return sum;
    }
}
