package thinkjava.thread.exception;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-04-11 20:18
 * @Vertion 1.0
 **/
public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler{
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("caught " + e);
    }
}
