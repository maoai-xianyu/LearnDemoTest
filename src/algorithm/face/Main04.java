package algorithm.face;

/**
 * @author zhangkun
 * @time 2020/6/15 11:26 上午
 *
 * 给出一个链表，每 k 个节点一组进行翻转，并返回翻转后的链表。k 是一个正整数，它的值小于或等于链表的长度。
 * 如果节点总数不是 k 的整数倍，那么将最后剩余节点保持原有顺序。
 * 给定这个链表：1->2->3->4->5
 *
 * 当 k = 2 时，应当返回: 2->1->4->3->5
 *
 * 当 k = 3 时，应当返回: 3->2->1->4->5
 */
public class Main04 {

    //定义Node节点
    static class ListNode {
        public int val;
        public ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        //1.获取输入信息
        String[] strings = {"1", "2", "3", "4", "5"};
        int k = 2;
        //2.创建头结点
        ListNode head = new ListNode(0);
        ListNode tail = head;
        //3.将输入的字符串变为链表节点
        for (String str : strings) {
            ListNode newNode = new ListNode(Integer.valueOf(str));
            tail.next = newNode;
            tail = tail.next;
        }
        head = head.next;
        //每k个反转链表
        ListNode node = reverseGroup(head, k);
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    //不停地取k个进行翻转，如果不够k个，就直接返回,结束
    public static ListNode reverseGroup(ListNode head, int k) {
        if (head == null || head.next == null || k <= 1)
            return head;
        ListNode currentNode = head;
        //获取k个元素的首尾节点
        for (int count = 1; count < k; count++) {
            currentNode = currentNode.next;
            //不够K个则返回
            if (currentNode == null)
                return head;
        }
        ListNode next = currentNode.next;
        //对局部链表进行反转
        reverse(head, currentNode);
        head.next = reverseGroup(next, k);
        return currentNode;
    }

    //写一个头尾节点反转的局部函数
    public static ListNode reverse(ListNode head, ListNode tail) {
        if (head == null || head.next == null)
            return head;
        ListNode pre = null;
        ListNode next = null;
        while (pre != tail) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
