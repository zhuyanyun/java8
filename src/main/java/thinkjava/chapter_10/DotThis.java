package thinkjava.chapter_10;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-22 21:13
 * @Vertion 1.0
 **/
public class DotThis {
    void f(){
        System.out.println("Dothis.f()");
    }

    public class Inner{
        public DotThis outer(){
            return DotThis.this;
        }
    }

    public Inner inner(){
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dotThis = new DotThis();
        dotThis.f();

        DotThis.Inner inner = dotThis.inner();
        inner.outer().f();

    }
}
