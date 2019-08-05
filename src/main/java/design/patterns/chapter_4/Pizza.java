package design.patterns.chapter_4;

import java.util.ArrayList;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-05 10:32
 * @Vertion 1.0
 **/
public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;

    ArrayList toppings = new ArrayList<>();

    void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough~");
        System.out.println("Adding sauce~");
        System.out.println("Adding toppings~");
        for(int i = 0; i < toppings.size(); i++){
            System.out.println("  " + toppings.get(i));
        }
    }

    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
