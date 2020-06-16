package algorithm.my;

import java.util.Stack;

/**
 * @author zhangkun
 * @time 2020/6/15 11:54 上午
 *
 * 单链表相关算法面试问题讲解
 * 删除单链表中指定数值的节点
 */
public class ReadyTest02 {

    private class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    // 1. 单列表中删除指定数值的节点方法：利用栈
    public Node removeValue1(Node head,int num){
        Stack<Node> stack = new Stack<>();
        while (head != null){
            if (head.data != num){
                stack.add(head);
            }
            head = head.next;
        }
        while (!stack.isEmpty()){
            stack.peek().next = head;
            head = stack.pop();
        }
        return head;
    }

    // 2. 单列表中删除指定数值的节点方法：不利用栈
    public Node removeValue2(Node head,int num){
        while (head != null){
            if (head.data != num){
               break;
            }
            head = head.next;
        }
        Node pre = head;
        Node cur = head;
        while (cur != null){
            if (cur.data == num){
                pre.next = cur.next;
            }else {
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }

}
