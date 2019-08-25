package thinkjava.chapter_11;

import java.util.*;

/**
 * Created by zyy on 19/8/25.
 */
public class PriorityQueueDemo {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random random = new Random();
        for(int i=0; i<10; i++){
            priorityQueue.offer(random.nextInt(i+10));
        }
        QueueDemo.printQ(priorityQueue);

        List<Integer> ints = Arrays.asList(25, 22, 1, 3, 4, 56, 78, 98, 90, 33, 45, 24, 36, 79, 15, 18);
        priorityQueue = new PriorityQueue<>(ints);
        QueueDemo.printQ(priorityQueue);

        priorityQueue = new PriorityQueue<Integer>(ints.size(), Collections.reverseOrder());
        priorityQueue.addAll(ints);
        QueueDemo.printQ(priorityQueue);

        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split(""));
        PriorityQueue<String> stringsPQ = new PriorityQueue<>(strings);
        QueueDemo.printQ(stringsPQ);

        stringsPQ = new PriorityQueue<>(strings.size(), Collections.reverseOrder());
        stringsPQ.addAll(strings);
        QueueDemo.printQ(stringsPQ);

        HashSet<Character> charSet = new HashSet<>();
        for(char c : fact.toCharArray()){
            charSet.add(c);
        }
        PriorityQueue<Character> characterPQ = new PriorityQueue<>(charSet);
        QueueDemo.printQ(characterPQ);

    }
}
