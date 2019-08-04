package jike.concurrent.step_28;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-06-25 19:29
 * @Vertion 1.0
 **/
public class test2 {

    public static void main(String[] args) {

//        String h = new String("hw");
//        String h2 = h.intern();
//        String h1 = "hw";
//        System.out.println(h == h1); //false
//        System.out.println(h2 == h1);//true 
//        System.out.println(h2 == h);//false 
//
//
//        String s3 = new String("1") + new String("1");
//        String s4 = "11";
//        String s6 = s3.intern();
        String s6 = new String("11");
        String s4 =new String("1") + new String("1");
        String s8 = s4.intern();
        String s7 = s6.intern();

        System.out.println(s7 == s8);
    }
}
