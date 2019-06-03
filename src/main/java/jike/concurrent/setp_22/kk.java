package jike.concurrent.setp_22;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-05-30 18:12
 * @Vertion 1.0
 **/
public class kk {

    public static void main(String[] args) {

        ReNameThreadFactory zyy = new ReNameThreadFactory("zyy");
        Thread thread = zyy.newThread(new Runnable() {
            @Override
            public void run() {
                System.out.println("********");
            }
        });
        System.out.println("======" + thread.getName());
    }
}
