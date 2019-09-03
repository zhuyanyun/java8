package thinkjava.chapter_15.generac;

import thinkjava.chapter_15.fanxing.Coffee;
import thinkjava.chapter_15.fanxing.CoffeeGenerator;
import thinkjava.chapter_15.fanxing.Fibonacci;

import java.util.*;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-09-03 15:20
 * @Vertion 1.0
 **/
public class Generators {

    public static <T> Collection<T> fill(List<T> coll, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++){
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffee = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
        for(Coffee c : coffee){
            System.out.println(c);
        }

        Collection<Integer> fnumbers =  fill(new ArrayList<Integer>(), new Fibonacci(), 12);
        for(int i : fnumbers){
            System.out.print(i + ", ");
        }
    }

}
