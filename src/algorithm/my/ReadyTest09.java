package algorithm.my;

import javax.swing.tree.TreeNode;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author zhangkun
 * @time 2020/6/15 11:54 上午
 * <p>
 * 二叉树相关算法面试问题讲解-
 * 分层遍历及变体应用 -
 */
public class ReadyTest09 {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data) {
            this.val = data;
        }
    }

    // 1. 宽度优先遍历
    public static void levelTraversal(TreeNode root){
        if (root == null){
            return;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.push(root);
        while (!queue.isEmpty()){
            TreeNode cur = queue.removeFirst();
            System.out.println(cur.val+" ");
            if (cur.left != null){
                queue.add(cur.left);
            }
            if (cur.right != null){
                queue.add(cur.right);
            }
        }
    }

    //2. 按层打印二叉树
    public ArrayList<Integer> printFromTopToBottom(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayBlockingQueue<>(100);
        TreeNode last = root; // 当前行的最后节点
        TreeNode nLast = root; // 下一行的最右节点
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode out = queue.poll();
            System.out.println(out.val+" ");
            list.add(out.val);
            if (out.left != null){
                queue.add(out.left);
                nLast = out.left;
            }
            if (out.right != null){
                queue.add(out.right);
                nLast = out.right;
            }
            if (out == last){
                System.out.println("");
                last = nLast;
            }
        }
        return list;
    }

}
