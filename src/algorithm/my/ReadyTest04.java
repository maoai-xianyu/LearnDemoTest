package algorithm.my;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Stack;

/**
 * @author zhangkun
 * @time 2020/6/15 11:54 上午
 * <p>
 * 单链表相关算法面试问题讲解
 * 两个单链表生成相加链表
 *
 * 1 -> 3 -> 4
 * 4 -> 8 -> 9
 * 相加
 * 6 -> 2 -> 3
 *
 */
public class ReadyTest04 {

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node addList2(Node head1, Node head2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while (head1 != null) {
            stack1.push(head1.data);
            head1 = head1.next;
        }
        while (head2 != null) {
            stack2.push(head2.data);
            head2 = head2.next;
        }
        int n1 = 0; // 链表1的数值
        int n2 = 0;// 链表2的数值
        int n = 0;// n1+n2+ca
        int ca = 0; // 进位

        Node node = null; // 当前节点
        Node pnode = null;// 当前节点的前驱结点
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            n1 = stack1.isEmpty() ? 0 : stack1.pop();
            n2 = stack2.isEmpty() ? 0 : stack2.pop();
            n = n1 + n2 + ca;
            node = new Node(n % 10);
            node.next = pnode;
            pnode = node;
            ca = n / 10;
        }

        if (ca == 1) {
            pnode = node;
            node = new Node(n / 10);
            node.next = pnode;
        }
        return node;


    }

}
