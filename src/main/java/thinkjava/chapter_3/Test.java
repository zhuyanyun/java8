package thinkjava.chapter_3;


import java.util.Random;

import static jdk.nashorn.internal.objects.Global.print;
import static jdk.nashorn.internal.objects.Global.setArrayBuffer;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-15 07:50
 * @Vertion 1.0
 **/
public class Test {
    public static void main(String[] args) {
//        print("Hello,it's");
//        System.out.println(5/2);
        Random random = new Random(47);
//        System.out.println(random);
        int j = random.nextInt(100);
        int k = random.nextInt(100);
//        float v = random.nextFloat();
//        System.out.println(j);
//        System.out.println(k);
//        System.out.println(v);


        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));

//        System.out.println(k || j);
//        boolean a = true;
//        System.out.println("kkk" + a);
//
//        float f = 1.39e-43f;
//        System.out.println(f);

//        int i = -1;
//        System.out.println(Integer.toBinaryString(i));
//        int m = -2;
//        System.out.println(Integer.toBinaryString(m));
//        int n = 2;
//        System.out.println(Integer.toBinaryString(n));
//        n <<= 5;
//        System.out.println(n);

//        int i = 200;
//        long lg = (long)i;
//        lg = i;
//        long lg2 = (long)200;
//        lg2 = 200;
//
//        i = (int)lg2;


          double d = 0.7D;
          double  d2 = 0.3D;
        System.out.println((int)d);
        System.out.println(Math.round(d));
        System.out.println(Math.round(d2));

    }
}
