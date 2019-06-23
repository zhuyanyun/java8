package jike.concurrent.step_24;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-06-19 14:06
 * @Vertion 1.0
 **/
public class CompletabelTest3 {


    public void sleep(int t,TimeUnit u){
        try {
            u.sleep(t);
        }catch(InterruptedException e){}
    };

    public static void main(String[] args) {

        CompletabelTest3 completabelTest3 = new CompletabelTest3();

        CompletableFuture<String> f1 =
                CompletableFuture.supplyAsync(()->{
                    int t = (int)Math.random() * 10;
                    completabelTest3.sleep(t, TimeUnit.SECONDS);
                    return String.valueOf(t);
                });

        CompletableFuture<String> f2 =
                CompletableFuture.supplyAsync(()->{
                    int t = (int)Math.random() * 10;
                    completabelTest3.sleep(t, TimeUnit.SECONDS);
                    return String.valueOf(t);
                });

        CompletableFuture<String> f3 =
                f1.applyToEither(f2,s -> s);

        System.out.println(f3.join());
    }
}
