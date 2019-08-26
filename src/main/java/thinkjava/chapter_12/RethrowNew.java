package thinkjava.chapter_12;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-26 17:53
 * @Vertion 1.0
 **/
public class RethrowNew{

    public static void f() throws OneException{
        System.out.println("originating the exception in f()");
        throw new OneException("thrown from f()");
    }

    public static void main(String[] args) {
        try{
            try{
                f();
            }catch (OneException e){
                System.out.println("Cauthr in inner try,e.printStackTrace");
                e.printStackTrace(System.out);
                throw new TwoException("from inner try");
            }
        }catch (TwoException e){
            System.out.println("Caught in outer try,e.printStackTrace");
            e.printStackTrace(System.out);
        }
    }

}


class OneException extends Exception{
    public OneException(String s){
        super(s);
    }
}


class TwoException extends Exception{
    public TwoException(String s){
        super(s);
    }
}


