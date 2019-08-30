package thinkjava.chapter_14;

import sufa.array_05.Array;

import java.util.Arrays;
import java.util.List;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-27 20:25
 * @Vertion 1.0
 **/
public class SweetShop {

    public static void main(String[] args) throws ClassNotFoundException {
        new Candy();
        Class<?> aClass = Class.forName("thinkjava.chapter_14.Gum");
        String s2 = Cookie.S;

        List<Integer> list = Arrays.asList(new Integer[]{1, 2, 3, 4, 5});

    }
}

class Candy{
    static {
        System.out.println("Loading Candy");
    }
}

//class Gum{
//    static {
//        System.out.println("Loading Gum");
//    }
//}

class Cookie{
    
    public static final String S = "kkkk";
    
    public Cookie(){
        System.out.println("====cookie");
    }
}
