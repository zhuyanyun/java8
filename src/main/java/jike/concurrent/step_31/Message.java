//package jike.concurrent.step_31;
//
///**
// * @Description TODO
// * @Author zhuyanyun
// * @Date 2019-06-05 20:59
// * @Vertion 1.0
// **/
//class Message {
//
//    String id;
//    String content;
//
//    public Message(String id, String content) {
//        this.id = id;
//        this.content = content;
//    }
//
//    // 该方法可以发送消息
//    void send(Message msg){
//        // 省略相关代码
//    }
//    //MQ 消息返回后会调用该方法
//    // 该方法的执行线程不同于
//    // 发送消息的线程
//    void onMessage(Message msg){
//        // 省略相关代码
//    }
//
//    // 处理浏览器发来的请求
//    Respond handleWebReq(){
//        // 创建一消息
//        Message msg1 = new
//                Message("1","{...}");
//        // 发送消息
//        send(msg1);
//        // 如何等待 MQ 返回的消息呢？
//        String result = ...;
//    }
//
//
//}
