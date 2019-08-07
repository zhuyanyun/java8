package design.patterns.chapter_7.Duck;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-06 17:11
 * @Vertion 1.0
 **/
public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Turkey gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
