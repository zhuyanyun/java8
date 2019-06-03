package thinkjava.thread.interrupt;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-04-28 16:04
 * @Vertion 1.0
 **/
public class SynchronizedBlocked implements Runnable {
    public synchronized void f(){
        while (true){
            Thread.yield();
        }
    }

    public SynchronizedBlocked(){
        new Thread(){
            public void run(){
                f();
            }
        }.start();
    }


    @Override
    public void run() {
        System.out.println("Trying to call f()");
        f();
        System.out.println("Exiting SynchronizedBlocked.run()");
    }
}
