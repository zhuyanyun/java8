package jike.principle;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-07-31 14:10
 * @Vertion 1.0
 **/
public class CreateKf {
    public static void main(String[] args) {
        float sum = 0.0f;
         float c = 0.0f;
        for (int i = 0; i < 20000000; i++) {
            float x = 1.0f;
            float y = x - c;
            float t = sum + y;
            c = (t-sum)-y;
            sum = t;
        }
        System.out.println("sum is " + sum);


        ArrayList<Object> objects = new ArrayList<>();

        HashMap<Object, Object> map = new HashMap<>();
//        map.

    }
}
