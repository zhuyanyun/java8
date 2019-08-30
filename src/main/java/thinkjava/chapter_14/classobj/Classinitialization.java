package thinkjava.chapter_14.classobj;

import java.util.Random;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-28 08:24
 * @Vertion 1.0
 **/
public class Classinitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws ClassNotFoundException {
        Class initable = Initable.class;
        System.out.println("After creating Initable ref");
        System.out.println(Initable.staticFinal);
        System.out.println(Initable.staticFinal2);

        System.out.println(Initable2.staticNonFinal);
        System.out.println();

        Class<?> initable3 = Class.forName("thinkjava.chapter_14.classobj.Initable3");
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticFinal);
    }
}


class Initable{
    static final int staticFinal = 47;
    static final int staticFinal2 = Classinitialization.rand.nextInt(1000);

    static {
        System.out.println("Initializing Initable");
    }
}


class Initable2{
    static int staticNonFinal = 247;

    static {
        System.out.println("Initializing Initable2");
    }
}


class Initable3{
    static int staticFinal = 347;

    static {
        System.out.println("Initializing Initable3");
    }
}
