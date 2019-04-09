package arithmeticExcise;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-01-07 08:51
 * @Vertion 1.0
 **/
public class NodesInParis {

    private static Node temp;

    public Node addNode(Node node){
        while(temp.next != null){
            temp.next = node;
        }
        return temp;
    }

    public Node swapPairs(Node head) {
        Node node = new Node(0); // 头结点
        node.next = head;

        // p指向新的链表的尾结点
        Node p = node;
        Node tmp;

        // 每两个进行操作
        while (p.next != null && p.next.next != null) {
            // 记录下一次要进行处理的位置
            tmp = p.next.next;
            // 下面三句完成两个结点交换
            p.next.next = tmp.next;
            tmp.next = p.next;
            p.next = tmp;
            // 指向返回链表的新的尾结点
            p = tmp.next;
        }

        head = node.next;
        node.next = null;

        return head;
    }

    public static void main(String[] args) {
        NodesInParis nodes = new NodesInParis();
        nodes.addNode(new Node(3));
        nodes.addNode(new Node(2));
        nodes.addNode(new Node(4));
        Node nodds = nodes.addNode(new Node(1));
        nodes.swapPairs(nodds);
    }


}
