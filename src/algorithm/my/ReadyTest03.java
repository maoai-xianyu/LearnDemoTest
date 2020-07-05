package algorithm.my;

import java.util.HashSet;
import java.util.Stack;

/**
 * @author zhangkun
 * @time 2020/6/15 11:54 上午
 * <p>
 * 单链表相关算法面试问题讲解
 * 删除单链表中数值重复出现的节点
 * 重复的节点
 *
 * 在一个排序的链表中，存在重复的结点，
 * 请删除该链表中重复的结点，重复的结点不保留，返回链表头指针
 */
public class ReadyTest03 {

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node node = new Node(2);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(2);
        Node node4 = new Node(3);
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        //deleteDuplication(node);

        //Node node5 = deleteDuplication1(node);
        Node node5 = deleteDuplication2(node);

        while (node5 != null) {
            System.out.println(node5.data);
            node5 = node5.next;
        }


    }

    public static void deleteDuplication(Node head) {
        if (head == null) {
            return;
        }
        HashSet<Integer> set = new HashSet<>();
        Node pre = head;
        Node cur = head.next;
        set.add(head.data);
        while (cur != null) {
            if (set.contains(cur.data)) {
                pre.next = cur.next;
            } else {
                set.add(cur.data);
                pre = cur;
            }
            cur = cur.next;
        }

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static Node deleteDuplication1(Node pHead) {
        if (pHead == null) {
            return null;
        }
        HashSet<Integer> set = new HashSet<>();
        Node pre = pHead;
        Node cur = pre.next;
        set.add(pHead.data);
        while (cur != null) {
            if (set.contains(cur.data)) {
                pre.next = cur.next;
            } else {
                set.add(cur.data);
                pre = cur;
            }
            cur = cur.next;
        }
        return pHead;

    }


    public static Node deleteDuplication2(Node pHead) {
        Node node = new Node(-1);
        Node cur = pHead;
        Node tmpHead = node;
        while (cur != null) {
            if (cur.next != null && cur.data == cur.next.data) {
                while (cur.next != null && cur.data == cur.next.data) {
                    cur = cur.next;
                }
                //cur指向的这个节点，和前面的节点不同
                cur = cur.next;
                tmpHead.next = cur;
            } else {
                //确定不为重复的节点，串
                tmpHead.next = cur;
                tmpHead = cur;
                cur = cur.next;
            }
        }
        return node.next;
    }


}
