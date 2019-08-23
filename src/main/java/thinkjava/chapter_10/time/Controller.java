package thinkjava.chapter_10.time;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-23 17:38
 * @Vertion 1.0
 **/
public class Controller {
    private List<Event> eventList = new ArrayList<Event>();
    public void addEvent(Event v) {
        eventList.add(v);
    }

    public void run(){
        while(eventList.size() > 0){
            for(Event v : new ArrayList<Event>(eventList)){
                if(v.ready()){
                    System.out.println(v);
                    v.action();
                    eventList.remove(v);
                }
            }
        }
    }
}
