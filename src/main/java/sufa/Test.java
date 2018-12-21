package sufa;/**
 * Created by mac on 2018/12/10.
 */

import com.alibaba.fastjson.JSON;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2018/12/10 下午6:24
 * @Vertion 1.0
 **/
public class Test {

    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        try {
            Date parse =format.parse("20180945");
            System.out.println(JSON.toJSONString(parse));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
