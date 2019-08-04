package design.patterns.chapter_3;

/**
 * Created by zyy on 19/8/4.
 */
public  class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
