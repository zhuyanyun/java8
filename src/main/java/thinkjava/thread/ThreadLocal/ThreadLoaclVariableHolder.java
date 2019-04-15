package thinkjava.thread.ThreadLocal;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-04-13 11:06
 * @Vertion 1.0
 **/
public class ThreadLoaclVariableHolder {

    private static final ThreadLocal<Integer> value = new ThreadLocal<Integer>(){
//        private Random rand = new Random(47);
        protected synchronized Integer initialValue(){
//            System.out.println("***" + rand);
            System.out.println("399393");
            return 10;
//            return rand.nextInt(10000);
        }
    };


//    private static final ThreadLocal<Integer> value = new ThreadLocal<Integer>();

    public static void increment(){
        Integer b = value.get();
        value.set(value.get() + 1);
    }

    public static int get(){
        return value.get();
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0; i< 5; i++){
            exec.execute(new Accessor(i));
        }
        TimeUnit.SECONDS.sleep(1);
        exec.shutdownNow();
    }
}
