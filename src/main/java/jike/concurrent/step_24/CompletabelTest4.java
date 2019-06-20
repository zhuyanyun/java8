package jike.concurrent.step_24;

import java.util.concurrent.CompletableFuture;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-06-19 14:18
 * @Vertion 1.0
 **/
public class CompletabelTest4 {

    public static void main(String[] args) {

//        CompletableFuture<Integer>
//                f0 = CompletableFuture.supplyAsync(()->(7/0))
//                .thenApply(r->r*10);
//        System.out.println(f0.join());


        CompletableFuture<Integer>
                f0 = CompletableFuture
                .supplyAsync(()->7/0).thenApply(r-> r*10)
                .exceptionally(e->0);
        System.out.println(f0.join());


    }
}
