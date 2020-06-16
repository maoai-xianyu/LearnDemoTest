package algorithm.my;

import java.util.Stack;

/**
 * @author zhangkun
 * @time 2020/6/15 11:54 上午
 * <p>
 * 单链表相关算法面试问题讲解
 * 删除单链表的倒数第k个节点
 */
public class ReadyTest06 {

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node removeLastKthNode(Node head, int k) {
        if (k <= 0 || head == null) {
            return head;
        }
        Node p = head;
        for (int i = 0; i < k; i++) {
            if (p.next != null) {
                p = p.next;
            } else {
                return head;
            }
        }

        Node q = head;
        while (p.next != null){
            p = p.next;
            q = p.next;
        }
        q.next = q.next.next;
        return head;
    }

}
