package jike.concurrent.step_23;

import jike.concurrent.setp_22.ReNameThreadFactory;

import java.util.concurrent.*;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-05-30 20:59
 * @Vertion 1.0
 **/
public class FutureTest2 {

    public static void main(String[] args) throws Exception{
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor
                (5, 10, 100L, TimeUnit.SECONDS,
                        new LinkedBlockingDeque<Runnable>(5), new ReNameThreadFactory("zyy"), new ThreadPoolExecutor.AbortPolicy());



        Future<Object> submit = threadPoolExecutor.submit(new Callable<Object>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("询价1=={} ,hahah {}");
                return 1;
            }

        });
        Integer i = (Integer)submit.get();
        System.out.println("打印i "+i);

        Future<Object> submit2 = threadPoolExecutor.submit(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                System.out.println("询价2=={} ,hahah {}");
                return 2;
            }

        });
        Integer i2 = (Integer)submit2.get();
        System.out.println("打印i2:" + i2);

        Future<Object> submit3 = threadPoolExecutor.submit(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                System.out.println("询价3=={} ,hahah {}");
                return 3;
            }

        });
        Integer i3 = (Integer)submit3.get();

        System.out.println("打印i3:" + i3);

    }


}
