//package jike.concurrent.step_19;
//
//import java.util.concurrent.CountDownLatch;
//import java.util.concurrent.Executor;
//import java.util.concurrent.Executors;
//
///**
// * @Description TODO
// * @Author zhuyanyun
// * @Date 2019-06-17 20:12
// * @Vertion 1.0
// **/
//public class CountDownLatchTest {
//
//    // 创建 2 个线程的线程池
//    Executor executor =
//            Executors.newFixedThreadPool(2);
//    while(true){
//        // 计数器初始化为 2
//        CountDownLatch latch = new CountDownLatch(2);
//        // 查询未对账订单
//        executor.execute(() -> {
////            pos = getPOrders();
//            latch.countDown();
//        });
//        // 查询派送单
//        executor.execute(() -> {
////            dos = getDOrders();
//            latch.countDown();
//        });
//
//        // 等待两个查询操作结束
//        try {
//            latch.await();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        // 执行对账操作
//        diff = check(pos, dos);
//        // 差异写入差异库
//        save(diff);
//    }
//
//}
