package jike.concurrent.step_24;

import java.util.concurrent.CompletableFuture;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-06-03 10:22
 * @Vertion 1.0
 **/
public class CompletabelTest2 {

    public static void main(String[] args) {
        CompletableFuture<String> f0 =
                CompletableFuture.supplyAsync(
                        () -> "Hello World")      //①
                        .thenApply(s -> s + " QQ")  //②
                        .thenApply(String::toUpperCase);//③

        System.out.println(f0.join());

    }
}
