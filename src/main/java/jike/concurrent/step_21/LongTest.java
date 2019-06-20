package jike.concurrent.step_21;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-06-18 09:25
 * @Vertion 1.0
 **/
public class LongTest {

    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong();
        atomicLong.getAndIncrement();

        long andUpdate = atomicLong.getAndUpdate((x) -> {

            return (long) (x+3.33);
        });
        System.out.println(andUpdate);
    }
}
