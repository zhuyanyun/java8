package thinkjava.chapter_10.user;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-23 17:07
 * @Vertion 1.0
 **/
public class Callee2 extends MyIncrement {
    private int i = 0;
    @Override
    public void increment() {
        super.increment();
        i++;
        System.out.println(i);
    }

    private class Closure implements Incrementable{
        @Override
        public void increment() {
            Callee2.this.increment();
        }
    }

    Incrementable getCallbackReference(){
        return new Closure();
    }
}
