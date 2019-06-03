package jike.concurrent.step_05;

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
}
