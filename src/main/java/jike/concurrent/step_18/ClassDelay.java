package jike.concurrent.step_18;

import java.util.concurrent.locks.StampedLock;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-06-21 19:22
 * @Vertion 1.0
 **/
public class ClassDelay {

    private double x, y;
    final StampedLock sl = new StampedLock();

    // 存在问题的方法
    void moveIfAtOrigin(double newX, double newY) {
        long stamp = sl.readLock();
        try {
            while (x == 0.0 && y == 0.0) {
                long ws = sl.tryConvertToWriteLock(stamp);
                if (ws != 0L) {
                    stamp = ws;

                    x = newX;
                    y = newY;
                    break;
                } else {
                    sl.unlockRead(stamp);
                    stamp = sl.writeLock();
                }
            }
        } finally {
            sl.unlock(stamp);
        }


    }
}
