package design.patterns.chapter_4;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-05 10:45
 * @Vertion 1.0
 **/
public class PizzaTest {
    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a" + pizza.getName() + "\n");

        pizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Joel ordered a" + pizza.getName() + "\n");

    }
}
