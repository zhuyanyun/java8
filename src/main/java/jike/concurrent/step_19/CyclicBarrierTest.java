//package jike.concurrent.step_19;
//
//import java.util.Vector;
//import java.util.concurrent.CyclicBarrier;
//import java.util.concurrent.Executor;
//import java.util.concurrent.Executors;
//
///**
// * @Description TODO
// * @Author zhuyanyun
// * @Date 2019-05-28 09:18
// * @Vertion 1.0
// **/
//public class CyclicBarrierTest<P, D> {
//
//    // 订单队列
//    Vector<P> pos;
//
//    // 派送单队列
//    Vector<D> dos;
//
//    // 执行回调的线程池
//    Executor executor = Executors.newFixedThreadPool(1);
//
//    final CyclicBarrier barrier = new CyclicBarrier(2, () -> {
//        executor.execute(() -> check());
//    });
//
//    void check() {
//        P p = pos.remove(0);
//        D d = dos.remove(0);
//        // 执行对账操作
//        diff = check(p, d);
//        // 差异写入差异库
//        save(diff);
//    }
//
//    void checkAll() {
//        // 循环查询订单库
//        Thread T1 = new Thread(() -> {
//            while (存在未对账订单) {
//                // 查询订单库
//                pos.add(getPOrders());
//                // 等待
//                barrier.await();
//            }
//        });
//        T1.start();
//        // 循环查询运单库
//        Thread T2 = new Thread(() -> {
//            while (存在未对账订单) {
//                // 查询运单库
//                dos.add(getDOrders());
//                // 等待
//                barrier.await();
//            }
//        });
//        T2.start();
//    }
//
//}
