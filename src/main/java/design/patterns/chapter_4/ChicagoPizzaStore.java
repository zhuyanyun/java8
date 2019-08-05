package design.patterns.chapter_4;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-05 10:49
 * @Vertion 1.0
 **/
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        if("cheese".equals(item)){
            return new ChicagoStyleCheesePizza();
        }else if("viggie".equals(item)){
            return null;
        }else {
            return null;
        }
    }
}
