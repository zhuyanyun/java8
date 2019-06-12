package jike.concurrent.step_30;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-06-03 21:21
 * @Vertion 1.0
 **/
public class ThreadId {

        static final AtomicLong
                nextId=new AtomicLong(0);
        // 定义 ThreadLocal 变量
        static final ThreadLocal<Long>
                tl=ThreadLocal.withInitial(()->nextId.getAndIncrement());
        // 此方法会为每个线程分配一个唯一的 Id
        static long get(){
            return tl.get();
        }
}
