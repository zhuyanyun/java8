package thinkjava.chapter_12;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-26 20:14
 * @Vertion 1.0
 **/
public class ExceptionSilencer {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }finally {
            return;
        }
    }
}
