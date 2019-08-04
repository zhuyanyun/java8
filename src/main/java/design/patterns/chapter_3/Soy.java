package design.patterns.chapter_3;

/**
 * Created by zyy on 19/8/4.
 */
public class Soy extends ConditmentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Soy";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
