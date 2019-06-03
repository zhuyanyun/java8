package jike.concurrent.step_04;

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
}
