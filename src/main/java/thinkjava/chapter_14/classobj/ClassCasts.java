package thinkjava.chapter_14.classobj;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-28 09:37
 * @Vertion 1.0
 **/

class Bulding{}
class House extends Bulding{}

public class ClassCasts {
    public static void main(String[] args) {
        Bulding b = new House();
        Class<House> houseClass = House.class;
        House h = houseClass.cast(b);
        h = (House)b;

//        new Pet()
    }
}
