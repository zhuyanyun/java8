package design.patterns.chapter_3;

/**
 * Created by zyy on 19/8/4.
 */
public  class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
