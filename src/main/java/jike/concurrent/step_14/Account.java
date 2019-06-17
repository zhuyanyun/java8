package jike.concurrent.step_14;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.util.concurrent.TimeUnit.NANOSECONDS;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-06-17 09:38
 * @Vertion 1.0
 **/
public class Account {
    private int balance;
    private final Lock lock
            = new ReentrantLock();
    // 转账
    void transfer(Account tar, int amt) throws InterruptedException {
        boolean flag = true;
        while (flag) {
            if(this.lock.tryLock(1, NANOSECONDS)) {
                try {
                    if (tar.lock.tryLock(3,NANOSECONDS)) {
                        try {
                            this.balance -= amt;
                            tar.balance += amt;
                        } finally {
                            tar.lock.unlock();
                            flag = false;
                        }
                    }//if
                } finally {
                    this.lock.unlock();
                }
            }//if
        }//while
    }//transfer
}
