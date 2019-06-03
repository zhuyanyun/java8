package thinkjava.thread.interrupt;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-04-28 15:50
 * @Vertion 1.0
 **/
public class IOBlocked implements Runnable {
    private InputStream in;

    public IOBlocked(InputStream is){
        in = is;
    }


    @Override
    public void run() {
        try {
            System.out.println("Waiting for read()");
            in.read();
        } catch (IOException e) {
//            e.printStackTrace();
            if(Thread.currentThread().isInterrupted()){
                System.out.println("Interrupted from bloked I/O");
            }else {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Exiting INBlocked run()");
    }
}
