package jike.concurrent.step_24;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-05-31 18:10
 * @Vertion 1.0
 **/
public class CompletableTest {

    public void sleep(int t,TimeUnit u){
        try {
            u.sleep(t);
        }catch(InterruptedException e){}
    };

    public static void main(String[] args) {

//        CompletableFuture.supplyAsync();
//        TimeUnit u;
//

        CompletableTest test = new CompletableTest();

        // 任务 1：洗水壶 -> 烧开水
        CompletableFuture<Void> f1 =
                CompletableFuture.runAsync(()->{
                    System.out.println("T1: 洗水壶...");
                    test.sleep(15, TimeUnit.SECONDS);

                    System.out.println("T1: 烧开水...");
                    test.sleep(15, TimeUnit.SECONDS);
                });
// 任务 2：洗茶壶 -> 洗茶杯 -> 拿茶叶
        CompletableFuture<String> f2 =
                CompletableFuture.supplyAsync(()->{
                    System.out.println("T2: 洗茶壶...");
                    test.sleep(1, TimeUnit.SECONDS);

                    System.out.println("T2: 洗茶杯...");
                    test.sleep(2, TimeUnit.SECONDS);

                    System.out.println("T2: 拿茶叶...");
                    test.sleep(1, TimeUnit.SECONDS);
                    return " 龙井 ";
                });
// 任务 3：任务 1 和任务 2 完成后执行：泡茶
        CompletableFuture<String> f3 =
                f1.thenCombine(f2, (__, tf)->{
                    System.out.println("T1: 拿到茶叶:" + tf);
                    System.out.println("T1: 泡茶...");
                    return " 上茶:" + tf;
                });


        CompletableFuture future = new CompletableFuture();
        future.thenApply((x) -> {
            return "xxxx";
        });
        // 等待任务 3 执行结果
        System.out.println(f3.join());
    }
}
