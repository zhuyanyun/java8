package arithmeticExcise;

/**
 * @Description TODO  反转一个单链表
 *
 * @Author zhuyanyun
 * @Date 2019-01-05 18:53
 * @Vertion 1.0
 **/
public class ReverseLinked {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

//    public static void main(String[] args) {
//        ReverseLinked reverseLinked = new ReverseLinked();
//        ListNode listNode1 = reverseLinked.ListNode(1);
//        ListNode listNode2 = new ListNode(2);
//
//    }
}
