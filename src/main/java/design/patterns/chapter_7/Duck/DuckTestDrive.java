package design.patterns.chapter_7.Duck;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-06 17:18
 * @Vertion 1.0
 **/
public class DuckTestDrive {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says");
        turkey.gobble();
        turkey.fly();

        System.out.println("the Duck says");
        testDuck(duck);

        System.out.println("the turkeyAdapter says");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
