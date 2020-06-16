package algorithm.my;

import java.util.Stack;

/**
 * @author zhangkun
 * @time 2020/6/15 11:54 上午
 * <p>
 * 二叉树相关算法面试问题讲解-
 * 中序遍历
 */
public class ReadyTest11 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.val = data;
        }
    }

    // 递归方式
    public static void inorderTraversalRec(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversalRec(root.left);
        System.out.println(root.val + " ");
        inorderTraversalRec(root.right);
    }

    // 迭代方式
    public static void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        if (cur != null){
            while (!stack.isEmpty() || cur != null) {
                if (cur != null){
                    stack.push(cur);
                    cur = cur.left;
                }else {
                    cur = stack.pop();
                    System.out.println(cur.val+" ");
                    cur = cur.right;
                }
            }
        }
    }

}
