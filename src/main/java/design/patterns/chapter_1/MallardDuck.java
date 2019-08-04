package design.patterns.chapter_1;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-03 11:13
 * @Vertion 1.0
 **/
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quark();
    }

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.flyBehavior.fly();
        mallardDuck.quackBehavior.quack();

    }
}
