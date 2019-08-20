package thinkjava.chapter_7;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-20 09:12
 * @Vertion 1.0
 **/
class Insect{
    private int i = 0;
    protected int j;
    Insect(){
        System.out.println("i = " + i + ",j=" +j);
        j = 39;
    }

    private static int x1 = printInit("static Insect.x1 initialized");

    static int printInit(String a){
        System.out.println(a);
        return 47;
    }
}



public class Beetle extends Insect{
    private int k = printInit("Beetle.k initialized");
    public Beetle(){
        System.out.println("k =" + k);
        System.out.println("j =" + j);
    }
    private static int x2 = printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {
        System.out.println("Beetle construtor");
        Beetle b = new Beetle();
    }
}
