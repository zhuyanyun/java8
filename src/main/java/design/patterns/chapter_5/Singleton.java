package design.patterns.chapter_5;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-05 16:11
 * @Vertion 1.0
 **/
public class Singleton {

    private static volatile Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance(){
        if(uniqueInstance == null){
            synchronized (Singleton.class){
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
