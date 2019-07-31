package jike.principle;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-07-31 14:04
 * @Vertion 1.0
 **/
public class ff {

    public static void main(String[] args) {
        float sum = 0.0f;
        for (int i = 0; i < 20000000; i++) {
            float x = 1.0f;
            sum += x;
        }
        System.out.println("sum is " + sum);
    }
}
