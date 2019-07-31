//package jike.concurrent.step_31;
//
//
///**
// * @Description TODO
// * @Author zhuyanyun
// * @Date 2019-06-27 14:46
// * @Vertion 1.0
// **/
//public class NewMessage {
//
//    // 处理浏览器发来的请求
//    Respond handleWebReq(){
//        int id= 序号生成器.get();
//        // 创建一消息
//        Message msg1 = new
//                Message(id,"{...}");
//        // 创建 GuardedObject 实例
//        GuardedObject<Message> go=
//                GuardedObject.create(id);
//        // 发送消息
//        send(msg1);
//        // 等待 MQ 消息
//        Message r = go.get(
//                t->t != null);
//    };
//
//    void onMessage(Message msg){
//        // 唤醒等待的线程
//        GuardedObject.fireEvent(
//                msg.id, msg);
//    }
//
//
//}
