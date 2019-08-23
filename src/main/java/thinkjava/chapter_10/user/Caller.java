package thinkjava.chapter_10.user;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-23 17:10
 * @Vertion 1.0
 **/
public class Caller {
    private Incrementable callbackReference;
    Caller(Incrementable cbh){
        callbackReference = cbh;
    }
    void go(){callbackReference.increment();}
}
