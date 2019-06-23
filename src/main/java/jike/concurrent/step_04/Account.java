package jike.concurrent.step_04;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-05-14 19:36
 * @Vertion 1.0
 **/
public class Account {
    private int balance;
    // 转账
    void transfer(Account target, int amt){
        synchronized(Account.class) {
            if (this.balance > amt) {
                this.balance -= amt;
                target.balance += amt;
            }

        }
    }

    public static void main(String[] args) throws Exception{
        long time1 = Calendar.getInstance().getTime().getTime();
        System.out.println(Calendar.getInstance().getTime());
        Account accountA = new Account();
        accountA.balance = 200000;


        Account accountB = new Account();
        accountB.balance = 200000;

        Account accountC = new Account();
        accountC.balance = 200000;

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=10000;i++){
                    accountA.transfer(accountB,10);

                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=10000;i++) {
                    accountB.transfer(accountC,10);
                }
            }
        });

        thread2.start();
        thread.start();

        thread.join();
        thread2.join();

        System.out.println(accountA.balance);
        System.out.println(accountB.balance);
        System.out.println(accountC.balance);
        System.out.println((Calendar.getInstance().getTime().getTime()- time1));
    }
}
