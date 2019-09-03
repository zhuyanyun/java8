package thinkjava.chapter_15.generac;

import net.mindview.util.Generator;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-09-03 15:54
 * @Vertion 1.0
 **/
public class BasicGenerator<T> implements Generator<T> {

    private Class<T> type;

    public BasicGenerator(Class<T> type) {
        this.type = type;
    }

    @Override
    public T next() {
        try{
            return type.newInstance();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public static <T> Generator<T> create(Class<T> type){
        return new BasicGenerator<T>(type);
    }
}
