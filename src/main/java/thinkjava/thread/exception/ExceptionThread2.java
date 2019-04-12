package thinkjava.thread.exception;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-04-11 20:25
 * @Vertion 1.0
 **/
public class ExceptionThread2 implements Runnable {

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println("run() by" + thread);
        System.out.println("eh =" + thread.getUncaughtExceptionHandler());
        throw new RuntimeException();
    }
}
