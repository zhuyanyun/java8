package thinkjava.thread.Runnable;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-04-10 15:11
 * @Vertion 1.0
 **/
public class BasicThreads {
    public static void main(String[] args) {
        Thread thread = new Thread(new LiftOff());
        thread.start();
        System.out.println("Waiting for LiftOff");
    }
}
