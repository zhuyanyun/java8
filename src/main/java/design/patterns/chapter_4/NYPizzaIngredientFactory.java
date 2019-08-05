package design.patterns.chapter_4;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-05 14:58
 * @Vertion 1.0
 **/
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return null;
    }

    @Override
    public Sauce createSauce() {
        return null;
    }

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }
}
