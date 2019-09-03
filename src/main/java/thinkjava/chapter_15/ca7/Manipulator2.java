package thinkjava.chapter_15.ca7;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-09-03 17:50
 * @Vertion 1.0
 **/


public class Manipulator2<T extends HasF> {
    private T obj;
    public Manipulator2(T x){
        obj = x;
    }

    public void manipulate(){
        obj.f();
    }
}
