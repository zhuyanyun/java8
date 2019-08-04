package design.patterns.chapter_3;

/**
 * Created by zyy on 19/8/4.
 */
public class Espresso extends Beverage {

    public Espresso (){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
