package jike.concurrent.step_16;

import java.util.List;
import java.util.Vector;
import java.util.concurrent.Semaphore;
import java.util.function.Function;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-05-27 20:03
 * @Vertion 1.0
 **/
public class ObjPool<T,R>  {

    final List<T> pool;
    // 用信号量实现限流器
    final Semaphore sem;
    // 构造函数
    ObjPool(int size, T t){
        pool = new Vector<T>(){};
        for(int i=0; i<size; i++){
            pool.add(t);
        }
        sem = new Semaphore(size);
    }
    // 利用对象池的对象，调用 func
    R exec(Function<T,R> func) throws InterruptedException {
        T t = null;
        sem.acquire();
        try {
            t = pool.remove(0);
            System.out.println("从对象池中获取对象：剩余对象数："+pool.size());
            return func.apply(t);
        } finally {
            pool.add(t);
            sem.release();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        // 创建对象池
        ObjPool<Integer, Integer> pool = new ObjPool<Integer, Integer>(4, 2222);
        // 通过对象池获取 t，之后执行
//        pool.exec(t -> {
//            System.out.println(t);
//            return t.toString();
//        });

        for(int i =0; i< 5;i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        pool.exec(t -> {
                            System.out.println(t.toString());
                            try {
                                System.out.println("=====");
                                Thread.sleep(5000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            return t;
                        });
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.start();
        }
    }
}
