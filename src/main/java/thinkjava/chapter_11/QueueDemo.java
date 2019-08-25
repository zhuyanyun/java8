package thinkjava.chapter_11;

import com.alibaba.fastjson.JSONArray;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by zyy on 19/8/25.
 */
public class QueueDemo {

    public static void printQ(Queue queue){
        while (queue.peek() != null){
            System.out.print(queue.remove() + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<Integer>();
        Random random = new Random();
        for(int i=0; i<10; i++){
            queue.offer(random.nextInt(i + 10));
        }
        System.out.println(JSONArray.toJSONString(queue));
        printQ(queue);

        LinkedList<Character> characters = new LinkedList<>();
        for (char c : "Brontosaurus".toCharArray()){
            characters.offer(c);
        }
        System.out.println(JSONArray.toJSONString(characters));
        printQ(characters);
    }
}
