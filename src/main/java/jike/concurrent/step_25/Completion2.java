//package jike.concurrent.step_25;
//
//import java.util.concurrent.*;
//import java.util.concurrent.atomic.AtomicReference;
//
///**
// * @Description TODO
// * @Author zhuyanyun
// * @Date 2019-06-03 13:55
// * @Vertion 1.0
// **/
//public class Completion2 {
//
//    public static void main(String[] args) throws Exception {
//
//        // 创建线程池
//        ExecutorService executor =
//                Executors.newFixedThreadPool(3);
//// 创建 CompletionService
//        CompletionService<Integer> cs = new
//                ExecutorCompletionService<>(executor);
//// 异步向电商 S1 询价
//        cs.submit(()->getPriceByS1());
//// 异步向电商 S2 询价
//        cs.submit(()->getPriceByS2());
//// 异步向电商 S3 询价
//        cs.submit(()->getPriceByS3());
//// 将询价结果异步保存到数据库
//// 并计算最低报价
//        AtomicReference<Integer> m =
//                new AtomicReference<>(Integer.MAX_VALUE);
//
//        CountDownLatch latch = new CountDownLatch(3);
//
//        for (int i=0; i<3; i++) {
//            executor.execute(()->{
//                Integer r = null;
//                try {
//                    r = cs.take().get();
//                } catch (Exception e) {}
//                save(r);
//                m.set(Integer.min(m.get(), r));
//                latch.countDown();
//            });
//        }
//        latch.await();
//        return m;
//
//
//    }
//}
