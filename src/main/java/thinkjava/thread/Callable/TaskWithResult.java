package thinkjava.thread.Callable;

import java.util.concurrent.Callable;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-04-09 20:59
 * @Vertion 1.0
 **/
public class TaskWithResult implements Callable<String> {

    private int id;

    public TaskWithResult(int id){
        this.id = id;
    }


    @Override
    public String call() {
        return "result of TaskWithResult" + id ;
    }
}
