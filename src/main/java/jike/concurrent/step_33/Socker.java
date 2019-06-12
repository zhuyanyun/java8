//package jike.concurrent.step_33;
//
//import com.sun.xml.internal.ws.api.pipe.Fiber;
//
//import java.io.UncheckedIOException;
//import java.net.InetSocketAddress;
//import java.nio.ByteBuffer;
//import java.nio.channels.ServerSocketChannel;
//import java.nio.channels.SocketChannel;
//import java.util.concurrent.locks.LockSupport;
//
///**
// * @Description TODO
// * @Author zhuyanyun
// * @Date 2019-06-10 15:24
// * @Vertion 1.0
// **/
//public class Socker {
//
//    final ServerSocketChannel ssc = ServerSocketChannel.open().bind(new InetSocketAddress(8080));
//    // 处理请求
//    try{
//        while (true) {
//            // 接收请求
//            final SocketChannel sc = serverSocketChannel.accept();
//            Fiber.schedule(()->{
//                try {
//                    // 读 Socket
//                    ByteBuffer rb = ByteBuffer
//                            .allocateDirect(1024);
//                    sc.read(rb);
//                    // 模拟处理请求
//                    LockSupport.parkNanos(2000*1000000);
//                    // 写 Socket
//                    ByteBuffer wb = (ByteBuffer)rb.flip();
//                    sc.write(wb);
//                    // 关闭 Socket
//                    sc.close();
//                } catch(Exception e){
//                    throw new UncheckedIOException(e);
//                }
//            });
//        }//while
//    }finally{
//        ssc.close();
//    }
//
//
//
//}
