//package jike.concurrent.step_25;
//
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.Future;
//
///**
// * @Description TODO
// * @Author zhuyanyun
// * @Date 2019-06-03 11:14
// * @Vertion 1.0
// **/
//public class ExecuteFutureFail {
//
//    public static void main(String[] args) {
//
//        // 创建线程池
//        ExecutorService executor =
//                Executors.newFixedThreadPool(3);
//// 异步向电商 S1 询价
//        Future<Integer> f1 =
//                executor.submit(
//                        ()->getPriceByS1());
//// 异步向电商 S2 询价
//        Future<Integer> f2 =
//                executor.submit(
//                        ()->getPriceByS2());
//// 异步向电商 S3 询价
//        Future<Integer> f3 =
//                executor.submit(
//                        ()->getPriceByS3());
//
//// 获取电商 S1 报价并保存
//        r=f1.get();
//        executor.execute(()->save(r));
//
//// 获取电商 S2 报价并保存
//        r=f2.get();
//        executor.execute(()->save(r));
//
//// 获取电商 S3 报价并保存
//        r=f3.get();
//        executor.execute(()->save(r));
//
//
//
//    }
//}
