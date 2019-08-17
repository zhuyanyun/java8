package thinkjava.chapter_5;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-17 14:04
 * @Vertion 1.0
 **/
public class House {
    Window w1 = new Window(1);

    House(){
        System.out.println("House");
//        w3 = new Window(33);
        System.out.println("w3:" +w3 );
    }

    Window w2 = new Window(2);
    void f(){
        System.out.println("f()");
    }
//    Window w3 = new Window(3);
    Window w3;

    public static void main(String[] args) {
        House house = new House();
        house.f();
    }

}
