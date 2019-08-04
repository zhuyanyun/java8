package design.patterns.chapter_3;

/**
 * Created by zyy on 19/8/4.
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription(){
        return  description;
    }

    public abstract double cost();
}
