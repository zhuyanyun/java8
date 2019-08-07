package design.patterns.chapter_8.hook;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-07 18:44
 * @Vertion 1.0
 **/
public abstract class CaffeineBeverageWithHook {

    void pripareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling water");
    }

    void pourInCup(){
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments() {
        return true;
    }
}
