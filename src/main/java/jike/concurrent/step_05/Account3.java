package jike.concurrent.step_05;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-05-14 20:14
 * @Vertion 1.0
 **/
public class Account3 {

    private int id;
    private int balance;

    //转账
    void transfer(Account3 target, int amt){
        Account3 left = this;
        Account3 right = target;

        if(this.id > target.id){
            left = target;
            right = this;
        }

        //锁定序号小的账户
        synchronized (left){
            //锁定序号大的账户
            synchronized (right){
                if(this.balance > amt){
                    this.balance -= amt;
                    target.balance += amt;
                }
            }
        }

    }

}
