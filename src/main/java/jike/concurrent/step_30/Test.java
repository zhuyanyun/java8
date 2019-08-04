package jike.concurrent.step_30;

import com.alibaba.fastjson.JSONObject;

import java.text.DateFormat;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-06-27 09:39
 * @Vertion 1.0
 **/
public class Test {
    public static void main(String[] args) {
        long l = ThreadId.get();
        System.out.println(l);

        DateFormat dateFormat = SafeDateFormat.get();
        System.out.println(JSONObject.toJSONString(dateFormat));


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                long l = ThreadId.get();
                System.out.println("=====" + l);
            }
        });
        thread.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                long l = ThreadId.get();
                System.out.println("=====" + l);
            }
        });
        thread2.start();


    }
}
