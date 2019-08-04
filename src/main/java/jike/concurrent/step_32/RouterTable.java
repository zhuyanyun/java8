//package jike.concurrent.step_32;
//
//import jike.concurrent.step_29.Router;
//
//import java.util.Set;
//import java.util.concurrent.ConcurrentHashMap;
//import java.util.concurrent.CopyOnWriteArraySet;
//import java.util.concurrent.Executors;
//import java.util.concurrent.ScheduledExecutorService;
//
//import static java.util.concurrent.TimeUnit.MINUTES;
//
///**
// * @Description TODO
// * @Author zhuyanyun
// * @Date 2019-06-27 15:11
// * @Vertion 1.0
// **/
//public class RouterTable {
//    // 路由表信息
//        //Key: 接口名
//        //Value: 路由集合
//        ConcurrentHashMap<String, CopyOnWriteArraySet<Router>>
//                rt = new ConcurrentHashMap<>();
//        // 路由表是否发生变化
//        volatile boolean changed;
//        // 将路由表写入本地文件的线程池
//        ScheduledExecutorService ses=
//                Executors.newSingleThreadScheduledExecutor();
//        // 启动定时任务
//        // 将变更后的路由表写入本地文件
//        public void startLocalSaver(){
//            ses.scheduleWithFixedDelay(()->{
//                autoSave();
//            }, 1, 1, MINUTES);
//        }
//        // 保存路由表到本地文件
//        void autoSave() {
//            if (!changed) {
//                return;
//            }
//            changed = false;
//            // 将路由表写入本地文件
//            // 省略其方法实现
//            this.save2Local();
//        }
//        // 删除路由
//        public void remove(Router router) {
//            Set<Router> set=rt.get(router.iface);
//            if (set != null) {
//                set.remove(router);
//                // 路由表已发生变化
//                changed = true;
//            }
//        }
//        // 增加路由
//        public void add(Router router) {
//            Set<Router> set = rt.computeIfAbsent(
//                    router.iface, r ->
//                            new CopyOnWriteArraySet<>());
//            set.add(router);
//            // 路由表已发生变化
//            changed = true;
//        }
//}
