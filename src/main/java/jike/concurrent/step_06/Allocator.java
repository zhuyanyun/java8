package jike.concurrent.step_06;

import java.util.List;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-05-14 21:22
 * @Vertion 1.0
 **/
public class Allocator {

    private List<Object> als;
    // 一次性申请所有资源
    synchronized void apply(Object from, Object to){
        // 经典写法
        while(als.contains(from) || als.contains(to)){
            try{
                wait();
            }catch(Exception e){
            }
        }
        als.add(from);
        als.add(to);
    }
    // 归还资源
    synchronized void free(Object from, Object to){
        als.remove(from);
        als.remove(to);
        notifyAll();
    }

}
