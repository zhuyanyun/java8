package thinkjava.thread.exception;

import java.util.concurrent.ThreadFactory;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-04-11 20:08
 * @Vertion 1.0
 **/
public class HandlerThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        System.out.println(this + "：：：：creating new Thread ");
        Thread t = new Thread(r);
        System.out.println("created " + t);
        t.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        System.out.println("en =" + t.getUncaughtExceptionHandler());
        return t;
    }
}
