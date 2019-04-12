package thinkjava.thread.Runnable;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-04-10 15:16
 * @Vertion 1.0
 **/
public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            new Thread(new LiftOff()).start();
            System.out.println("Waiting for LiftOff");
        }
    }
}
