package thinkjava.chapter_10.anonymous;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-23 09:26
 * @Vertion 1.0
 **/
public class AnonymousConstructor {
    public static Base getBase(int i){
        return new Base(i) {
            @Override
            public void f() {
                System.out.println("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}
