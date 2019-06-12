//package jike.concurrent.step_34;
//
//import java.io.IOException;
//import java.io.UncheckedIOException;
//import java.net.InetSocketAddress;
//import java.nio.ByteBuffer;
//import java.nio.channels.ServerSocketChannel;
//import java.nio.channels.SocketChannel;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.LinkedBlockingQueue;
//import java.util.concurrent.ThreadPoolExecutor;
//import java.util.concurrent.TimeUnit;
//
///**
// * @Description TODO
// * @Author zhuyanyun
// * @Date 2019-06-10 15:43
// * @Vertion 1.0
// **/
//public class Worker {
//
//
//    ExecutorService es = new ThreadPoolExecutor(
//            50, 500,
//            60L, TimeUnit.SECONDS,
//            // 注意要创建有界队列
//            new LinkedBlockingQueue<Runnable>(2000),
//            // 建议根据业务需求实现 ThreadFactory
//            r->{
//                return new Thread(r, "echo-"+ r.hashCode());
//            },
//            // 建议根据业务需求实现 RejectedExecutionHandler
//            new ThreadPoolExecutor.CallerRunsPolicy());
//
//
//    ServerSocketChannel ssc;
//
//    {
//        try {
//            ssc = ServerSocketChannel.open().bind(new InetSocketAddress(8080));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // 处理请求
//    try {
//        while (true) {
//            // 接收请求
//            SocketChannel sc = ssc.accept();
//            // 将请求处理任务提交给线程池
//            es.execute(()->{
//                try {
//                    // 读 Socket
//                    ByteBuffer rb = ByteBuffer
//                            .allocateDirect(1024);
//                    sc.read(rb);
//                    // 模拟处理请求
//                    Thread.sleep(2000);
//                    // 写 Socket
//                    ByteBuffer wb =
//                            (ByteBuffer)rb.flip();
//                    sc.write(wb);
//                    // 关闭 Socket
//                    sc.close();
//                }catch(Exception e){
//                    try {
//                        throw new Exception(e);
//                    } catch (Exception e1) {
//                        e1.printStackTrace();
//                    }
//                }
//            });
//        }
//    } finally {
//        ssc.close();
//        es.shutdown();
//    }
//
//
//}
