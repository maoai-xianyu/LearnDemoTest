package algorithm.my;

import java.util.Stack;

/**
 * @author zhangkun
 * @time 2020/6/15 11:54 上午
 * <p>
 * 二叉树相关算法面试问题讲解-
 * 后序遍历
 */
public class ReadyTest12 {

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
        inorderTraversalRec(root.right);
        System.out.println(root.val + " ");
    }

    // 迭代方式
    public static void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>(); // 第一个stack用于添加node和它的左右孩子
        Stack<TreeNode> output = new Stack<>(); // 第二个stack用于翻转第一个stack输出
        stack.push(root);
        while (!stack.isEmpty()) { // 确保所有元素都被翻转转移到第二个stack
            TreeNode cur = stack.pop(); // 把栈顶元素添加到第二个stack
            output.push(cur);

            if (cur.left != null) { // 把栈顶元素的左孩子和右孩子分别添加入第一个stack
                stack.push(cur.left);
            }
            if (cur.right != null) {
                stack.push(cur.right);
            }
        }
        while (!output.isEmpty()) { // 遍历输出第二个stack,后序遍历
            System.out.println(output.pop().val + " ");
        }

    }

}
