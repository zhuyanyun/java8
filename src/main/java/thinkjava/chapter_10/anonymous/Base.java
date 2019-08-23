package thinkjava.chapter_10.anonymous;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-23 09:24
 * @Vertion 1.0
 **/
public abstract class Base {
    public Base(int i){
        System.out.println("Base constructor,i=" + i);
    }

    public abstract void f();
}

