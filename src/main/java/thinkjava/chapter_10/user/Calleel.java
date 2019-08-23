package thinkjava.chapter_10.user;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-23 17:02
 * @Vertion 1.0
 **/
public class Calleel implements Incrementable {

    private int i = 0;
    @Override
    public void increment() {
        i++;
        System.out.println(i);
    }
}
