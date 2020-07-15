package algorithm.face;

/**
 * @author zhangkun
 * @time 2020/7/9 9:16 下午
 *
 * 单列表逆序，遇到k个节点逆序
 */
public class Main21 {
    public static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node neaHead = reverse(head.next);
        head.next.next = head;
        return neaHead;
    }

    // 每k个节点为一组逆转
    public static Node reverse(Node head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        Node cur = head;
        for (int i = 1; cur != null && i < k; i++) {
            cur = cur.next;
        }
        Node temp = cur.next;
        // 节点分离
        cur.next = null;
        // 反转
        Node newHead = reverse(head);
        // 把之后的部分链表进行每k个节点逆转
        Node newTemp = reverse(temp, k);
        // 将两部分节点链接起来
        newHead.next = newTemp;
        return newHead;
    }

    class Node {
        int data;
        Node next;

        public Node(int value) {
            data = value;
        }
    }
}
