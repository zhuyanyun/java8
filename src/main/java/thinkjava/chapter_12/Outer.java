package thinkjava.chapter_12;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-26 20:18
 * @Vertion 1.0
 **/
public class Outer extends Inner{
    @Override
    public void throwInner() throws NullPointerException {
        super.throwInner();
    }

    public static void main(String[] args) {
        try {
            throw new NullPointerException("aslfla");
        }catch (Exception e){
            System.out.println(e.getCause());
        }
    }
}
