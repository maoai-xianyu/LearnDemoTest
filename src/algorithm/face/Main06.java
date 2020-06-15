package algorithm.face;

import java.util.Stack;

/**
 * @author zhangkun
 * @time 2020/6/15 11:32 上午
 * 算法问题：java 两个栈实现一个队列 先进先出
 * 思路：左边A栈，右边B栈
 *  * 1.A栈往B栈压入数据，要一次性把A栈数据一个一个都压入B栈
 *  * 2.如果B栈不为空，A栈绝对不能向B栈压入数据
 */
public class Main06 {
    public Stack<Integer> stackPush;
    public Stack<Integer> stackPop;

    public Main06() {
        stackPush = new Stack<Integer>();
        stackPop = new Stack<Integer>();
    }

    //元素进栈
    public void add(int pushInt) {
        stackPush.push(pushInt);
    }

    public int poll() {
        if (stackPop.empty() && stackPush.empty()) {
            throw new RuntimeException("Queue is empty!");
        } else if (stackPop.empty()) {
            while (!stackPush.empty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }
//和poll效果一样
//    public int peek() {
//        if (stackPop.empty() && stackPush.empty()) {
//            throw new RuntimeException("Queue is empty!");
//        } else if (stackPop.empty()) {
//            while (!stackPush.empty()) {
//                stackPop.push(stackPush.pop());
//            }
//        }
//        return stackPop.peek();
//    }

    public static void main(String[] args) {

        Main06 queue = new Main06();
        queue.add(2);
        queue.add(4);
        queue.add(7);
        queue.add(13);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
