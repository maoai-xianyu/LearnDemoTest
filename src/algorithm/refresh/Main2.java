package algorithm.refresh;

/**
 * @author zhangkun
 * @time 2020/6/2 10:39 上午
 * <p>
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class Main2 {

    public static void main(String[] args) {

        ListNode head1 = new ListNode(2);
        ListNode node1 = new ListNode(4);
        ListNode end1 = new ListNode(3);
        head1.next = node1;
        node1.next =end1;

        ListNode head2 = new ListNode(5);
        ListNode node2 = new ListNode(6);
        ListNode end2 = new ListNode(4);
        head2.next = node2;
        node2.next = end2;

        ListNode node = addTwoNumbers(head1, head2);
        while (node != null){
            System.out.print(node.val);
            node = node.next;
        }


    }

    // 方法
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode cursor = root;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            int sumVal = l1Val + l2Val + carry;
            carry = sumVal / 10;

            ListNode sumNode = new ListNode(sumVal % 10);
            cursor.next = sumNode;
            cursor = sumNode;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return root.next;
    }


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
