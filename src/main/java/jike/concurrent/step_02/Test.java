package jike.concurrent.step_02;


/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-06-14 20:46
 * @Vertion 1.0
 **/
public class Test {


    // 以下代码来源于【参考 1】
    class VolatileExample {
        int x = 0;
        volatile boolean v = false;
        public void writer() {
            x = 42;
            v = true;
        }
        public void reader() {
            if (v == true) {
                // 这里 x 会是多少呢？
            }
        }
    }


}
