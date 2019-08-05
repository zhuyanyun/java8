package design.patterns.chapter_4;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-05 15:01
 * @Vertion 1.0
 **/
public class CheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        super.prepare();
    }
}
