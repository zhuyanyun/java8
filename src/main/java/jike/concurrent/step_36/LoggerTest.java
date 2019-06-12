//package jike.concurrent.step_36;
//
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.concurrent.BlockingQueue;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.TimeUnit;
//
///**
// * @Description TODO
// * @Author zhuyanyun
// * @Date 2019-06-10 17:53
// * @Vertion 1.0
// **/
//public class LoggerTest {
//
//
//    class Logger {
//        // 任务队列
//        final BlockingQueue<LogMsg> bq = new BlockingQueue<>();
//        //flush 批量
//        static final int batchSize=500;
//        // 只需要一个线程写日志
//        ExecutorService es =
//                Executors.newFixedThreadPool(1);
//        // 启动写日志线程
//        void start() throws IOException {
//            File file=File.createTempFile(
//                    "foo", ".log");
//            final FileWriter writer=
//                    new FileWriter(file);
//            this.es.execute(()->{
//                try {
//                    // 未刷盘日志数量
//                    int curIdx = 0;
//                    long preFT=System.currentTimeMillis();
//                    while (true) {
//                        LogMsg log = bq.poll(5, TimeUnit.SECONDS);
//                        // 写日志
//                        if (log != null) {
//                            writer.write(log.toString());
//                            ++curIdx;
//                        }
//                        // 如果不存在未刷盘数据，则无需刷盘
//                        if (curIdx <= 0) {
//                            continue;
//                        }
//                        // 根据规则刷盘
//                        if (log!=null && log.level==LEVEL.ERROR ||
//                                curIdx == batchSize ||
//                                System.currentTimeMillis()-preFT>5000){
//                            writer.flush();
//                            curIdx = 0;
//                            preFT=System.currentTimeMillis();
//                        }
//                    }
//                }catch(Exception e){
//                    e.printStackTrace();
//                } finally {
//                    try {
//                        writer.flush();
//                        writer.close();
//                    }catch(IOException e){
//                        e.printStackTrace();
//                    }
//                }
//            });
//        }
//        // 写 INFO 级别日志
//        void info(String msg) throws InterruptedException {
//            bq.put(new LogMsg(
//                    LEVEL.INFO, msg));
//        }
//        // 写 ERROR 级别日志
//        void error(String msg) throws InterruptedException {
//            bq.put(new LogMsg(
//                    LEVEL.ERROR, msg));
//        }
//    }
//    // 日志级别
//    enum LEVEL {
//        INFO, ERROR
//    }
//    class LogMsg {
//        LEVEL level;
//        String msg;
//        // 省略构造函数实现
//        LogMsg(LEVEL lvl, String msg){}
//        // 省略 toString() 实现
//        String toString(){}
//    }
//
//
//
//}
