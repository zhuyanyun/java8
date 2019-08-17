package thinkjava.chapter_5.objs;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-17 16:15
 * @Vertion 1.0
 **/
public class VaragType {

    static void f(Character... args){
        System.out.println(args.getClass());
        System.out.println("length " + args.length);
    }

    static void g(int... args){
        System.out.println(args.getClass());
        System.out.println("length " + args.length);
    }

    public static void main(String[] args) {
        f('a');
        f();
        g();
        g(1);
        System.out.println("int[]:" + new int[0].getClass());
    }
}
