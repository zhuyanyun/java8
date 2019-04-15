package thinkjava.thread.ThreadLocal;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-04-13 10:58
 * @Vertion 1.0
 **/
public class Accessor implements Runnable {

    private final int id;

    public Accessor(int idn){
        id =idn;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){
            ThreadLoaclVariableHolder.increment();
            System.out.println(this);
            Thread.yield();
        }
    }

    public String toString(){
        return "#" +id + ":" + ThreadLoaclVariableHolder.get();
    }
}
