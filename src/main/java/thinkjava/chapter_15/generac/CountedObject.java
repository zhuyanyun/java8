package thinkjava.chapter_15.generac;

import net.mindview.util.Generator;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-09-03 16:15
 * @Vertion 1.0
 **/
public class CountedObject {
    private static long counter = 0;
    private  long id = counter++;
    public long id(){return id;}

    public String toString(){
        return "CountedObject  " + id;
    }

    public static void main(String[] args) {
        Generator<CountedObject> objectGenerator = BasicGenerator.create(CountedObject.class);
        for (int i=0; i<5; i++){
            System.out.println(objectGenerator.next());
        }

    }
}
