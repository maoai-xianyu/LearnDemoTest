package algorithm.my;

/**
 * @author zhangkun
 * @time 2020/6/15 11:54 上午
 *
 * 链表相关算法面试问题讲解-链表相减
 * 删除单链表中的指定节点
 */
public class ReadyTest01 {

    private class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    // 1. 删除单列表中的指定节点
    public static void deleteNode(Node head,Node node){
        // 删除尾节点，采用顺序查到尾节点的前一个节点
        if (node.next == null){
            while (head.next != node){
                head = head.next;
            }
            head.next = null;
        }
        // 要删除的节点是头节点
        else if (head == node){
            head = null;
        }
        // 要删除的结点是中间普通结点
        else {
            Node q=node.next;
            node.data = q.data;
            node.next = q.next;
        }
    }



}
