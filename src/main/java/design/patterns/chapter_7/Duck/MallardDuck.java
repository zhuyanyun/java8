package design.patterns.chapter_7.Duck;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-06 17:09
 * @Vertion 1.0
 **/
public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("quark");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
