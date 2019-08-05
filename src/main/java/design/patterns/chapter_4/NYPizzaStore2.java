package design.patterns.chapter_4;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-05 10:49
 * @Vertion 1.0
 **/
public class NYPizzaStore2 extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if("cheese".equals(item)){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }else if("viggie".equals(item)){

        }else {

        }
        return pizza;
    }
}
