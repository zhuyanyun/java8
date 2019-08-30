package thinkjava.chapter_14.classobj;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-28 08:56
 * @Vertion 1.0
 **/
public class FilledList<T> {

    private Class<T> type;
    public FilledList(Class<T> type){
        this.type = type;
    }

    public List<T> create(int mElements) throws IllegalAccessException, InstantiationException {
        List<T> result = new ArrayList<T>();
        for(int i=0; i < mElements; i++){
           result.add(type.newInstance());
        }
        return result;
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
         FilledList<CountedInteger> f =
            new FilledList<CountedInteger>(CountedInteger.class);
        System.out.println(f.create(15));
    }
}

class CountedInteger{
    private static long counter;
    private final long id = counter++;
    public String toString(){
        return Long.toString(id);
    }
}
