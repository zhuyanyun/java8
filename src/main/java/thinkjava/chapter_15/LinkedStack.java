package thinkjava.chapter_15;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-30 14:18
 * @Vertion 1.0
 **/
public class LinkedStack<T> {

    private static class Node<U>{
        U item;
        Node<U> next;
        Node(){
            item = null;
            next = null;
        }
        Node(U item, Node<U> next){
            this.item = item;
            this.next = next;
        }
        boolean end(){
            return item == null && next == null;
        }
    }

    private Node<T> top = new Node<T>();   //end sentinel
    public void push(T item){
        top = new Node<T>(item, top);
    }
    public T pop(){
        T result = top.item;
        if(!top.end()){
            top = top.next;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> stack = new LinkedStack<>();
        for(String s : "Phasers or stun!".split(" ")){
            stack.push(s);
        }
        String s;
        while ((s = stack.pop()) != null){
            System.out.println(s);
        }
    }
}
