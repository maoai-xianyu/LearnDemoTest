package algorithm.face;

/**
 * @author zhangkun
 * @time 2020/6/15 11:40 上午
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5...
 */
public class Main09 {


    private static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        ListNode node = new ListNode(0);
        node.next = pHead;
        ListNode preNode = node;
        ListNode cur = pHead;
        while (cur != null) {
            while (cur != null && cur.next != null && cur.val == cur.next.val) {
                cur = cur.next;
            }
            if (preNode.next != cur) {
                preNode.next = cur.next;
                cur = cur.next;
            } else {
                preNode = cur;
                cur = cur.next;
            }
        }
        return node.next;
    }

    public static void main(String[] args) {
        String[] strings = {"1", "2", "3", "3", "4","4","5"};
        ListNode head = new ListNode(0);
        ListNode tail = head;
        for (String str : strings) {
            ListNode newNode = new ListNode(Integer.valueOf(str));
            tail.next = newNode;
            tail = tail.next;
        }
        head = head.next;
        ListNode listNode = deleteDuplication(head);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }

}
