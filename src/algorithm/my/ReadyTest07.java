package algorithm.my;

import java.util.Stack;

/**
 * @author zhangkun
 * @time 2020/6/15 11:54 上午
 * <p>
 * 单链表相关算法面试问题讲解
 * 通过两个栈来实现一个队列
 *
 * 栈是先进后厨
 * 队列是先进先出
 */
public class ReadyTest07<T> {

    private Stack<T> stack1 = new Stack<>();
    private Stack<T> stack2 = new Stack<>();

    /**
     * 加入队列中的元素只加入到栈1
     */
    public  void appendTail(T item){
        stack1.push(item);
        System.out.println("压人栈元素 "+item);
    }

    /**
     * 删除一个元素是，检查栈2是否为空，栈2不为空则弹出栈2栈顶元素
     * 栈2为空，这把栈1中的元素全部弹出，压入到栈2中，然后从栈2栈顶弹出元素
     */
    public void deleteHead(){
        if (!stack2.isEmpty()){
            T pop = stack2.pop();
            System.out.println("弹出栈元素 "+pop);
        }else {
            if (stack1.isEmpty()){
                throw  new RuntimeException("队列为空");
            }else {
                while (!stack1.isEmpty()){
                    T pop = stack1.pop();
                    stack2.push(pop);
                }
            }
        }
    }

}

class ReadyTest07Main{
    public static void main(String[] args) {
        ReadyTest07<String> stringReadyTest07 = new ReadyTest07<>();
        stringReadyTest07.appendTail("test1");
        stringReadyTest07.appendTail("test2");
        stringReadyTest07.appendTail("test3");
        while (true){
            stringReadyTest07.deleteHead();
        }
    }
}
