package thinkjava.chapter_10.time;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-23 17:33
 * @Vertion 1.0
 **/
public abstract class Event {
    private long eventTime;
    protected final long delayTime;

    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }

    public void start(){
        eventTime = System.nanoTime() + delayTime;
    }

    public boolean ready(){
        return System.nanoTime() >= eventTime;
    }

    public abstract void action();
}
