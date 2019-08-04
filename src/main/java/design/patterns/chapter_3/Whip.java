package design.patterns.chapter_3;

/**
 * Created by zyy on 19/8/4.
 */
public class Whip extends ConditmentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Whip";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
