package arithmeticExcise.LinkedList;

/**
 * @Description TODO  反转一个单链表
 *
 * @Author zhuyanyun
 * @Date 2019-01-05 18:53
 * @Vertion 1.0
 **/
public class ReverseLinked {

    private Node head = null;

    class Node{
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }
    }

    //无头结点
    //表头部插入
    //这种操作将于输入的顺序相反，逆序
    public Node insertToHead(int value) {
        Node newNode = new Node(value, null);
        Node node = insertToHead(newNode);
        return node;
    }

    public Node insertToHead(Node newNode) {
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    //2153
    public Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null){
            Node nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        ReverseLinked reverseLinked = new ReverseLinked();
        reverseLinked.insertToHead(3);
        reverseLinked.insertToHead(5);
        reverseLinked.insertToHead(1);
        Node node = reverseLinked.insertToHead(2);
        Node reverseNode = reverseLinked.reverseList(node);

        while (reverseNode != null){
            System.out.print(reverseNode.getData());
            reverseNode = reverseNode.next;
        }
//        while (node != null) {
//            System.out.print(node.getData());
//            node = node.next;
//        }
        System.out.println("***********");
        System.out.println("===========");
    }
}
