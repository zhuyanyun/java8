package thinkjava.chapter_5.staticdata;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-17 14:18
 * @Vertion 1.0
 **/
public class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);
    Cupboard(){
        System.out.println("Cupboard()");
        bowl4.f1(2);
    }
    void f3(int marker){
        System.out.println("f3(" + marker + ")");
    }

    static Bowl bowl5 = new Bowl(5);
}
