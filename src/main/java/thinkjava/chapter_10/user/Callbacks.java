package thinkjava.chapter_10.user;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-23 17:11
 * @Vertion 1.0
 **/
public class Callbacks {
    public static void main(String[] args) {
        Calleel c1 = new Calleel();
        Callee2 c2 = new Callee2();
        MyIncrement.f(c2);
        Caller caller1 = new Caller(c1);
        Caller caller2 = new Caller(c2.getCallbackReference());
        caller1.go();
        caller2.go();

    }
}
