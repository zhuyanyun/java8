package jike.concurrent.step_05;

import jike.concurrent.step_04.Account;

import java.util.Calendar;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-05-14 19:19
 * @Vertion 1.0
 **/
public class Account2 {

    private int balance;

    //转账
    void transfer(Account2 targer, int amt){
        //锁定转出账户
        synchronized (this){
            //锁定转入账户
            synchronized (targer){
                if(this.balance > amt){
                    this.balance -= amt;
                    targer.balance += amt;
                }
            }
        }
    }


    public static void main(String[] args) throws Exception{
        long time1 = Calendar.getInstance().getTime().getTime();
        System.out.println(Calendar.getInstance().getTime());
        Account2 accountA = new Account2();
        accountA.balance = 200000;


        Account2 accountB = new Account2();
        accountB.balance = 200000;

        Account2 accountC = new Account2();
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
