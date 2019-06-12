//package jike.concurrent.step_40;
//
//import com.lmax.disruptor.util.Util;
//
//import java.util.concurrent.locks.LockSupport;
//
///**
// * @Description TODO
// * @Author zhuyanyun
// * @Date 2019-06-11 16:42
// * @Vertion 1.0
// **/
//public class DisruptorTest2 {
//
//
//    public static void main(String[] args) {
//
//        // 生产者获取 n 个写入位置
//        do {
//            //cursor 类似于入队索引，指的是上次生产到这里
//            current = Cursor.get();
//            // 目标是在生产 n 个
//            next = current + n;
//            // 减掉一个循环
//            long wrapPoint = next - bufferSize;
//            // 获取上一次的最小消费位置
//            long cachedGatingSequence = gatingSequenceCache.get();
//            // 没有足够的空余位置
//            if (wrapPoint>cachedGatingSequence || cachedGatingSequence>current){
//                // 重新计算所有消费者里面的最小值位置
//                long gatingSequence = Util.getMinimumSequence(
//                        gatingSequences, current);
//                // 仍然没有足够的空余位置，出让 CPU 使用权，重新执行下一循环
//                if (wrapPoint > gatingSequence){
//                    LockSupport.parkNanos(1);
//                    continue;
//                }
//                // 从新设置上一次的最小消费位置
//                gatingSequenceCache.set(gatingSequence);
//            } else if (cursor.compareAndSet(current, next)){
//                // 获取写入位置成功，跳出循环
//                break;
//            }
//        } while (true);
//
//
//    }
//}
