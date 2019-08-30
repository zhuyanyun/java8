package thinkjava.chapter_14.forName;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-27 20:40
 * @Vertion 1.0
 **/
public class ToyTest {

    static void printInfo(Class cc){
        System.out.println("Class name: " + cc.getName() + "    interface?【"+cc.isInterface() + "】");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Cannonical name: " + cc.getCanonicalName());
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c = null;
        c = Class.forName("thinkjava.chapter_14.forName.FancyToy");
        printInfo(c);
        System.out.println("=================");

        for(Class face : c.getInterfaces()){
            printInfo(face);
        }
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^");

        Class superclass = c.getSuperclass();
        Object obj = null;

        obj = superclass.newInstance();
//        Toy t = (Toy)obj;

        printInfo(obj.getClass());
    }
}

