package jike.concurrent.step_17;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-06-17 14:47
 * @Vertion 1.0
 **/
public class LazyLoadCache<K,V> {


        final Map<K, V> m =
                new HashMap<>();
        final ReadWriteLock rwl =
                new ReentrantReadWriteLock();
        final Lock r = rwl.readLock();
        final Lock w = rwl.writeLock();

        V get(K key) {
            V v = null;
            // 读缓存
            r.lock();         //①
            try {
                v = m.get(key);
            } finally{
                r.unlock();   //③
            }
            // 缓存中存在，返回
            if(v != null) {
                return v;
            }
            // 缓存中不存在，查询数据库
            w.lock();
            try {
                // 再次验证
                // 其他线程可能已经查询过数据库
                v = m.get(key);
                if(v == null){
                    // 查询数据库
//                    v= 省略代码无数
                    m.put(key, v);
                }
            } finally{
                w.unlock();
            }
            return v;
        }


}
