package algorithm.my;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author zhangkun
 * @time 2020/6/15 11:54 上午
 * <p>
 * 二叉树相关算法面试问题讲解-
 * 前序遍历
 */
public class ReadyTest10 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.val = data;
        }
    }

    // 递归方式
    public static void preorderTraversalRec(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val + " ");
        preorderTraversalRec(root.left);
        preorderTraversalRec(root.right);
    }

    // 迭代方式
    public static void preorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();// 出栈栈顶元素
            System.out.println(cur.val + " ");

            // 关键点：要先压入右孩子，在压入左孩子，这样在出栈时会先打印左孩子在打印右孩子
            if (cur.right != null) {
                stack.push(cur.right);
            }
            if (cur.left != null) {
                stack.push(cur.left);
            }
        }
    }

}
