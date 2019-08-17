package thinkjava.chapter_5.array;

import java.util.Arrays;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-17 15:12
 * @Vertion 1.0
 **/
public class ArrayOfPrimitives {
    public static void main(String[] args) {
        int[] a1= {1,2,3,4,5};
        int[] a2;
        a2 = a1;
        for(int i = 0; i < a2.length; i++){
            a2[i] = a2[i] + 10;
        }
//        for(int j = 0; j < a1.length; j++){
//            System.out.println(a1[j]);
//        }
        System.out.println(Arrays.toString(a2));

        int[] a3 = new int[8];
        System.out.println(a3[5]);
    }
}
