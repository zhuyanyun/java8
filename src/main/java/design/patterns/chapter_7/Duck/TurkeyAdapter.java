package design.patterns.chapter_7.Duck;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-06 17:14
 * @Vertion 1.0
 **/
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i = 0; i < 5; i++){
            turkey.fly();
        }
    }
}
