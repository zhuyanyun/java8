package thinkjava.thread.cancel.thread;

import java.util.Random;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-04-13 17:14
 * @Vertion 1.0
 **/
public class Count {
    private int count =0;
    private Random random = new Random(47);

    public synchronized int increment(){
        int temp = count;
        if(random.nextBoolean()){
            Thread.yield();
        }
        return (count = ++temp);
    }

    public synchronized int value(){return count;}
}
