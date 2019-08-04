//package jike.concurrent.step_28;
//
//import org.junit.Test;
//
///**
// * @Description TODO
// * @Author zhuyanyun
// * @Date 2019-06-03 18:27
// * @Vertion 1.0
// **/
public class Immutability {

    public static void main(String[] args) {

        String s3 = new String("11");
//        String s3 = new String("1") + new String("1");

        String s5 = s3.intern();
        String s4 = "11";
        System.out.println(s3 == s4);
        System.out.println(s4 == s5);


        final class Account {

            private final StringBuffer user;

            public Account(String user) {
                this.user = new StringBuffer(user);
            }

            public StringBuffer getUser() {
                return this.user;
            }

            public String toString() {
                return "user" + user;
            }

        }
    }
}
//
//
////    @Test
////    public void test4() {
////
////        String s3 = new String("1") + new String("1");
////        String s5 = s3.intern();
////        String s4 = "11";
////        System.out.println(s3 == s4);
////        System.out.println(s5 == s4);
////        System.out.println(s5 == s3);
////    }
//
//
//    public static void main(String[] args) {
//
//        String h = new String("12") + new String("3");
//        String h1 = new String("1") + new String("23");
//
//                String h2="123";
//
//
//        String h3 = h.intern();
//        String h4 = h1.intern();
//
////        String h2="123";
//
//
//        System.out.println(h == h1);
//        System.out.println(h3 == h4);
//        System.out.println(h == h3);
//        System.out.println(h3 == h2);
//        System.out.println(h4 == h2);
//    }
//
//    public static void main(String[] args) {
//
//
//        String h = new String("hw");
//    }   String h2 = h.intern();
//}       String h1 = "hw";
//
