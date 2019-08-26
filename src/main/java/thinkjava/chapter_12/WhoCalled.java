package thinkjava.chapter_12;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-26 16:49
 * @Vertion 1.0
 **/
public class WhoCalled {

    static void f(){
        try{
            throw new Exception();
        }catch (Exception e){
            for (StackTraceElement ste : e.getStackTrace()){
                System.out.println("======" + ste.getMethodName());
            }

            for (StackTraceElement ste : e.getStackTrace()){
                System.out.println("^^^^^^^" + ste.toString());
            }
        }
    }

    static void g(){
        f();
    }

    static void h(){
        f();;
    }

    public static void main(String[] args) {
        f();
        System.out.println("------------");
        g();
        System.out.println("---------------------");
        h();
    }
}
