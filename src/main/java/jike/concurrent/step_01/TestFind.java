package jike.concurrent.step_01;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-05-08 19:20
 * @Vertion 1.0
 **/
public class TestFind {
    public static void main(String[] args) throws Exception {
        Test test = new Test();
        long calc = test.calc();
        System.out.println(calc + "******");
    }
}
