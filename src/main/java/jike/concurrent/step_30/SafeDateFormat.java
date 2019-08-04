package jike.concurrent.step_30;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-06-27 09:44
 * @Vertion 1.0
 **/
public class SafeDateFormat {

    // 定义 ThreadLocal 变量
    static final ThreadLocal<DateFormat> tl =
            ThreadLocal.withInitial(
                    () -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

    static DateFormat get() {
        return tl.get();
    }

};
