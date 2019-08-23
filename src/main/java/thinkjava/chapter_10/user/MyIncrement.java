package thinkjava.chapter_10.user;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-23 17:03
 * @Vertion 1.0
 **/
public class MyIncrement {
    public void increment(){
        System.out.println("Other operation");
    }

    static void f(MyIncrement mi){
        mi.increment();
    }
}
