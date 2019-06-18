package jike.concurrent.step_18;

import java.util.concurrent.locks.StampedLock;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-06-17 19:35
 * @Vertion 1.0
 **/
public class StampTest {


    public static void main(String[] args) {
        final StampedLock sl =
                new StampedLock();

        // 获取 / 释放悲观读锁示意代码
        long stamp = sl.readLock();
        try {
            // 省略业务相关代码
        } finally {
            sl.unlockRead(stamp);
        }

        // 获取 / 释放写锁示意代码
        long stamp2 = sl.writeLock();
        try {
            // 省略业务相关代码
        } finally {
            sl.unlockWrite(stamp2);
        }

    }



}
