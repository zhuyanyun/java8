//package jike.concurrent.step_40;
//
//import com.lmax.disruptor.RingBuffer;
//import com.lmax.disruptor.dsl.Disruptor;
//import com.lmax.disruptor.util.DaemonThreadFactory;
//
//import java.nio.ByteBuffer;
//import java.util.concurrent.ArrayBlockingQueue;
//
///**
// * @Description TODO
// * @Author zhuyanyun
// * @Date 2019-06-11 15:34
// * @Vertion 1.0
// **/
//public class DisruptorTest {
//
//    // 自定义 Event
//    class LongEvent {
//        private long value;
//        public void set(long value) {
//            this.value = value;
//        }
//    }
//
//    public static void main(String[] args) throws InterruptedException {
////        ArrayBlockingQueue<Integer> integers = new ArrayBlockingQueue<Integer>();
////        integers.poll()
//
//        // 指定 RingBuffer 大小,
//        // 必须是 2 的 N 次方
//        int bufferSize = 1024;
//
//        // 构建 Disruptor
//        Disruptor<LongEvent> disruptor
//                = new Disruptor<>(
//                LongEvent::new,
//                bufferSize,
//                DaemonThreadFactory.INSTANCE);
//
//        // 注册事件处理器
//        disruptor.handleEventsWith((event, sequence, endOfBatch) ->
//                System.out.println("E: "+event));
//
//        // 启动 Disruptor
//        disruptor.start();
//
//        // 获取 RingBuffer
//        RingBuffer<LongEvent> ringBuffer
//                = disruptor.getRingBuffer();
//        // 生产 Event
//        ByteBuffer bb = ByteBuffer.allocate(8);
//        for (long l = 0; true; l++){
//            bb.putLong(0, l);
//            // 生产者生产消息
//            ringBuffer.publishEvent(
//                    (event, sequence, buffer) ->
//                            event.set(buffer.getLong(0)), bb);
//            Thread.sleep(1000);
//        }
//    }
//
//
//}
