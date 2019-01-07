package arithmeticExcise;



/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-01-07 08:30
 * @Vertion 1.0
 **/
public class MyWork {

    class Node{
        int val;
        Node next;
        Node(int x) { val = x; }


    }

    public Node reverseLinked(Node node){
        Node prev = null;
        Node cuur = node;

        while(cuur != null){
            Node temp = cuur.next;
            cuur.next = prev;
            prev = cuur;
            cuur = temp;
        }
        return node;
    }
}
