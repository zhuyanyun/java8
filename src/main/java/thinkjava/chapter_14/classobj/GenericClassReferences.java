package thinkjava.chapter_14.classobj;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-28 08:50
 * @Vertion 1.0
 **/
public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> integerClass = int.class;
        integerClass = Integer.class;
        intClass = double.class;
//        integerClass = double.class;  //Illegal

    }
}

class WildClass{
    public static void main(String[] args) {
        Class<?> intClass = int.class;
        intClass = double.class;
        intClass = String.class;
    }
}

class BoundedWildClass{
    public static void main(String[] args) {
        Class<? extends Number> intClass = int.class;
        intClass = double.class;
        intClass = Number.class;
//        intClass = String.class;

    }
}
