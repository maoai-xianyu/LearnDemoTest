package algorithm.face;

/**
 * @author zhangkun
 * @time 2020/7/9 9:16 下午
 * <p>
 * 单列表回环
 * <p>
 * 首先定义两个变量，一个fast,一个slow，让fast 每次走两步，slow每次走一步，
 * 当fast和slow相遇时，即是该链表存在环结构。如果该链表为无环结构，则当遍历完这个链表时也不会相遇。即是返回false。
 */
public class Main22 {

    // 判断链表是否为带环链表
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;

    }

    class ListNode {
        int value;
        ListNode next;
        public ListNode(int value) {
            this.value = value;
        }
    }

}
