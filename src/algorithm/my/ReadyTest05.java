package algorithm.my;

import java.util.Stack;

/**
 * @author zhangkun
 * @time 2020/6/15 11:54 上午
 * <p>
 * 单链表相关算法面试问题讲解
 * 判断一个单列表是否是回文结构  1  2  2  1
 */
public class ReadyTest05 {

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public boolean isPalindrome1(Node head) {
        if (head == null) {
            return false;
        }
        Stack<Node> stack = new Stack<>();
        Node cur = head;
        while (cur != null) {
            // 记住这个地方不是cur.next 不然最后一个节点没有压人栈
            stack.push(cur);
            cur = cur.next;
        }
        while (head.next != null) {
            if (head.data != stack.pop().data) {
                return false;
            }
            head = head.next;
        }
        return true;
    }

}
