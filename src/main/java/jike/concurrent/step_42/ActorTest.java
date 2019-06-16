//package jike.concurrent.step_42;
//
//import akka.actor.ActorRef;
//import akka.actor.ActorSystem;
//import akka.actor.Props;
//import akka.actor.UntypedActor;
//
///**
// * @Description TODO
// * @Author zhuyanyun
// * @Date 2019-06-11 20:23
// * @Vertion 1.0
// **/
//public class ActorTest {
//
//
//    // 该 Actor 当收到消息 message 后，
//    // 会打印 Hello message
//    static class HelloActor
//            extends UntypedActor {
//        @Override
//        public void onReceive(Object message) {
//            System.out.println("Hello " + message);
//        }
//    }
//
//    public static void main(String[] args) {
//        // 创建 Actor 系统
//        ActorSystem system = ActorSystem.create("HelloSystem");
//        // 创建 HelloActor
//        ActorRef helloActor =
//                system.actorOf(Props.create(HelloActor.class));
//        // 发送消息给 HelloActor
//        helloActor.tell("Actor", ActorRef.noSender());
//    }
//
//}
