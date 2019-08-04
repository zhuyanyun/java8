package jike.perfectcode;

import org.springframework.util.StringUtils;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-01 11:22
 * @Vertion 1.0
 *
 * @since 3.4.5
 **/
public class Test_09 extends Person {

    @Override
    @SuppressWarnings("deprecation")
    public String getName() {
//        this.clone();
        new String();
        return super.getName();

    }


}
