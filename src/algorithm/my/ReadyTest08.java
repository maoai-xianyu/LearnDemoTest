package algorithm.my;

import java.util.Stack;

/**
 * @author zhangkun
 * @time 2020/6/15 11:54 上午
 * <p>
 * 栈相关算法面试问题讲解-设计含最小函数min()的栈，要求min、push、pop的时间复杂度都是O(1)
 */
public class ReadyTest08 {

    private Stack<Integer> stack = new Stack<>(); // 定义用来存储数据的栈
    private Stack<Integer> minStack = new Stack<>(); // 定义用来存储最小数据的栈


    /**
     * 添加数据，首先是往stack栈中添加
     * 如果最小栈minStack为空，或者栈顶元素比新添加的元素要大，则将新元素也要添加到辅助栈中
     *
     * @param node
     */
    public void push(int node) {
        stack.push(node);
        if (minStack.isEmpty() || ((int) minStack.peek()) >= node) {
            minStack.push(node);
        }
    }

    /**
     * 如果stack空，直接返回
     * 如果stack不为空，得到栈顶元素，同时将栈顶元素弹出
     * 如果最小栈的栈顶元素与stack弹出的元素相等，那么最小栈也将其弹出
     */
    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        int node = stack.peek();
        stack.pop();
        if (minStack.peek() == node) {
            minStack.pop();
        }
    }

    /**
     * 查看栈的最小元素
     *
     * @return
     */
    public int min() {
        return minStack.peek();
    }
}
