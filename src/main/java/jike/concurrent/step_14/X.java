package jike.concurrent.step_14;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-06-03 17:10
 * @Vertion 1.0
 **/
public class X {

        private final Lock rtl = new ReentrantLock();

        int value;
        public void addOne() {
            // 获取锁
            rtl.lock();
            try {
                value+=1;
            } finally {
                // 保证锁能释放
                rtl.unlock();
            }
        }

}
