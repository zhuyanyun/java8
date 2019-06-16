package sufa.linkedlist_07;

/**
 * Created by zyy on 18/12/2.
 */
public class MyWork {

    private Node head = null;

    // 单链表反转
    public static Node reverse(Node list) {
        Node headNode = null;
        Node preciousNode = null;
        Node currentNode = list;
        while(currentNode !=null){
            Node next = currentNode.next;
            if(next ==null){
                headNode = currentNode;
            }
            currentNode.next = preciousNode;
            preciousNode = currentNode;
            currentNode = next;
        }
        return headNode;
    }

    // 检测环
    public static boolean checkCircle(Node list) {
        if (list == null) return false;

        Node fast = list.next;
        Node slow = list;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) return true;
        }

        return false;
    }

    // 求中间结点
    public static Node findMiddleNode(Node list) {
        if (list == null) return  null;

        Node fast = list;
        Node slow = list;

        while(fast.next != null && fast.next.next != null){
            fast = list.next.next;
            slow = list.next;
        }

        return  slow;
    }

    // 有序链表合并
    public static Node mergeSortedLists(Node la, Node lb) {
        if (la == null) return lb;
        if (lb == null) return la;

        Node p = la;
        Node q = lb;
        Node head;
        if (p.data < q.data) {
            head = p;
            p = p.next;
        } else {
            head = q;
            q = q.next;
        }
        Node r = head;

        while (p != null && q != null) {
            if (p.data < q.data) {
                r.next = p;
                p = p.next;
            } else {
                r.next = q;
                q = q.next;
            }
            r = r.next;
        }

        if (p != null) {
            r.next = p;
        } else {
            r.next = q;
        }

        return head;
    }

    // 删除倒数第K个结点
    public static Node deleteLastKth(Node list, int k) {
        Node fast = list;
        int i = 1;
        while (fast != null && i < k) {
            fast = fast.next;
            ++i;
        }

        if (fast == null) return list;

        Node slow = list;
        Node prev = null;
        while (fast.next != null) {
            fast = fast.next;
            prev = slow;
            slow = slow.next;
        }

        if (prev == null) {
            list = list.next;
        } else {
            prev.next = prev.next.next;
        }
        return list;
    }

    // 删除倒数第K个结点
    public static Node removeLastKthNode(Node head, int k) {
        if (k <= 0 || head == null)
            return head;
        Node p = head;
        for (int i = 0; i < k; i++) {
            if (p.next != null)
                p = p.next;
            else
                return head;
        }
        Node q = head;
        while (p.next != null) {
            p = p.next;
            q = q.next;
        }
        q.next = q.next.next;
        return head;
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



    public static class Node {
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


    public static void main(String[] args) {
//        MyWork myWork = new MyWork();
//        myWork.insertToHead(2);
//        myWork.insertToHead(4);
////        myWork.insertToHead(3);
////        myWork.insertToHead(4);
////        myWork.insertToHead(5);
////        myWork.insertToHead(6);
//        Node node = myWork.insertToHead(6);
////        myWork.reverse(node);
////        boolean b = myWork.checkCircle(node);
////        Node middleNode = myWork.findMiddleNode(node);
////        System.out.println(middleNode.getData());

        MyWork myWork2 = new MyWork();
        myWork2.insertToHead(1);
        myWork2.insertToHead(3);
//        myWork.insertToHead(3);
        myWork2.insertToHead(4);
        myWork2.insertToHead(5);
//        myWork.insertToHead(6);
        Node node2 = myWork2.insertToHead(6);
        Node mergeSortedLists = myWork2.removeLastKthNode(node2, 2);
        System.out.println(mergeSortedLists);
    }

}
