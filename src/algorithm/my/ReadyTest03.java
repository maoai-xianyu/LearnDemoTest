package algorithm.my;

import java.util.HashSet;
import java.util.Stack;

/**
 * @author zhangkun
 * @time 2020/6/15 11:54 上午
 *
 * 单链表相关算法面试问题讲解
 * 删除单链表中数值重复出现的节点
 */
public class ReadyTest03 {

    private class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    public void deleteDuplication(Node head){
        if (head == null){
            return;
        }
        HashSet<Integer> set = new HashSet<>();
        Node pre = head;
        Node cur = head.next;
        set.add(head.data);
        while (cur != null){
            if (set.contains(cur.data)){
                pre.next = cur.next;
            }else {
                set.add(cur.data);
                pre =cur;
            }
            cur = cur.next;
        }
    }

}
