package jike.concurrent.step_20;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-06-17 20:43
 * @Vertion 1.0
 **/
public class SynTest {

    public static void main(String[] args) {
        List<Object> list = Collections.synchronizedList(new ArrayList<>());
        new Vector<>();
    }
}
