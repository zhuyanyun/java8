//package jike.concurrent.step_25;
//
//import java.util.concurrent.CompletionService;
//import java.util.concurrent.ExecutorCompletionService;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
///**
// * @Description TODO
// * @Author zhuyanyun
// * @Date 2019-06-03 11:34
// * @Vertion 1.0
// **/
//public class CompletionServiceTest {
//
//    public static void main(String[] args) {
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
//        for (int i=0; i<3; i++) {
//            Integer r = cs.take().get();
//            executor.execute(()->save(r));
//        }
//
//
//
//    }
//}
