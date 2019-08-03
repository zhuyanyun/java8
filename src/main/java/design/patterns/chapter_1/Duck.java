package design.patterns.chapter_1;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-03 11:11
 * @Vertion 1.0
 **/
public class Duck {

    protected FlyBehavior flyBehavior;

    protected QuackBehavior quackBehavior;

    public void performQuack(){
        quackBehavior.quack();
    }
}
