package jike.concurrent.step_05;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-05-14 19:49
 * @Vertion 1.0
 **/
public class Account {

    // actr 应该为单例
    private Allocator actr;
    private int balance;
    // 转账
    void transfer(Account target, int amt){
        // 一次性申请转出账户和转入账户，直到成功
        while(!actr.apply(this, target)) {
            ;
        }
        try{
            // 锁定转出账户
            synchronized(this){
                // 锁定转入账户
                synchronized(target){
                    if (this.balance > amt){
                        this.balance -= amt;
                        target.balance += amt;
                    }
                }
            }
        } finally {
            actr.free(this, target);
        }
    }
}
