package design.patterns.chapter_8.hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-07 18:49
 * @Vertion 1.0
 **/
public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    boolean customerWantsCondiments() {

        String answer = gerUserInput();

        if(answer.toLowerCase().startsWith("y")) {
            System.out.println("需要：");
            return true;
        }else {
            return false;
        }

    }

    public String gerUserInput(){
        String answer = null;

        System.out.println("Would you like milk and sugar with your coffer(y/n)");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.out.println("IO error trying to read your answer");
        }

        if(answer == null){
            return "no";
        }

        return answer;
    }
}
