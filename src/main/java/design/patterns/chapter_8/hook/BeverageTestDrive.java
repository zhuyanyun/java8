package design.patterns.chapter_8.hook;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-07 19:38
 * @Vertion 1.0
 **/
public class BeverageTestDrive {

    public static void main(String[] args) {

        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("Making coffer+++++");
        coffeeWithHook.pripareRecipe();

        Object obj[] = new Object[]{};
//        Arrays.sort();
    }
}
