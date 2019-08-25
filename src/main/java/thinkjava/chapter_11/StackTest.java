package thinkjava.chapter_11;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by zyy on 19/8/24.
 */
public class StackTest<T> {

    private LinkedList<T> storage = new LinkedList<T>();
    public void push(T v){
        storage.addFirst(v);
    }

    public T peek(){
        return storage.getFirst();
    }

    public T pop(){
        return storage.removeFirst();
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for(String s : "My dog has fleas".split(" ")){
            stack.push(s);
        }
        while ((!stack.empty())){
            System.out.println(stack.pop() + " ");
        }
    }
}
