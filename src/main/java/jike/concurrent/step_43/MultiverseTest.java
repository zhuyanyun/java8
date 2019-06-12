//package jike.concurrent.step_43;
//
//import org.multiverse.api.StmUtils;
//
///**
// * @Description TODO
// * @Author zhuyanyun
// * @Date 2019-06-11 20:48
// * @Vertion 1.0
// **/
//public class MultiverseTest {
//
//    class Account{
//        // 余额
//        private TxnLong balance;
//        // 构造函数
//        public Account(long balance){
//            this.balance = StmUtils.newTxnLong(balance);
//        }
//        // 转账
//        public void transfer(Account to, int amt){
//            // 原子化操作
//            atomic(()->{
//                if (this.balance.get() > amt) {
//                    this.balance.decrement(amt);
//                    to.balance.increment(amt);
//                }
//            });
//        }
//    }
//
//}
