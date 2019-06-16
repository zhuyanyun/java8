package arithmeticExcise.LinkedList;


/**
 * Created by zyy on 19/1/6.
 */
public class MyTest {

    private

    class Node{
        private int data;

        private Node next;

        public Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
    }

    public Node reverseLinked(Node node){
        Node prev = null;
        Node curr = null;

        while(node != null){
            Node tempNode = curr.next;
            node.next = prev;
            prev = curr;
            curr = tempNode;
        }

        return prev;
    }
}
