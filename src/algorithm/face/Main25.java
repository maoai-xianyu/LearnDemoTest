package algorithm.face;

/**
 * @author zhangkun
 * @time 2020/7/11 6:51 下午
 */
public class Main25 {

    class Node {
        int value;
        Node left;
        Node right;
    }

    int deep(Node node) {
        if (node == null) {
            return 0;
        }
        int left = deep(node.left);
        int right = deep(node.right);
        return right > left ? right + 1 : left + 1;
    }

    boolean isFull(Node root) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return true;
        }

        int left = deep(root.left);
        int right = deep(root.right);

        if (left != right) {
            return false;
        }

        if (isFull(root.left) && isFull(root.right)) {
            return true;
        } else {
            return false;
        }

    }

}
