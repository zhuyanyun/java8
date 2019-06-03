package jike.concurrent.step_21;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-05-29 18:42
 * @Vertion 1.0
 **/
public class SafeWM {


    class WMRange{
        final int upper;
        final int lower;
        WMRange(int upper,int lower){
           this.upper = upper;
           this.lower = lower;
        }
    }

    final AtomicReference<WMRange> rf = new AtomicReference<>(
            new WMRange(0,0)
    );

    // 设置库存上限
    void setUpper(int v){
        WMRange nr;
        WMRange or
                = rf.get();
        do{
//            or = rf.get();
            // 检查参数合法性
            if(v < or.lower){
                throw new IllegalArgumentException();
            }
            nr = new WMRange(v, or.lower);
        }while(!rf.compareAndSet(or, nr));
    }


}
