package algorithm.face;

/**
 * @author zhangkun
 * @time 2020/6/25 11:08 上午
 * <p>
 * 递归非递归反转链表
 */
public class Main12 {


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    // 非递归实现
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode tmp = head.next;
            head.next = prev;
            prev = head;
            head = tmp;
        }
        return prev;
    }


    // 递归实现
    public ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode prev = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return prev;
    }

}
