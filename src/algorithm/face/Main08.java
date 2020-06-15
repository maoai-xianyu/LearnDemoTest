package algorithm.face;

/**
 * @author zhangkun
 * @time 2020/6/15 11:38 上午
 * <p>
 * 数组实现栈算法题
 */
public class Main08 {

    private String[] items; //数组
    private int count;  //栈中元素个数
    private int n;      //栈的大小

    //初始化数组
    public Main08(int n) {
        this.items = new String[n];
        this.n = n;
        this.count = 0;
    }

    //入栈操作
    public boolean Push(String item) {
        if (count == n) {  //如果为n则栈满了，入栈失败
            return false;
        }
        items[count] = item;//将item放到下标为count的位置
        count++;            //并且count加一
        return true;
    }

    //出栈操作
    public String Pop() {
        if (count == 0) {  //如果为零，则栈中无数据
            return null;
        }
        String temp = items[count - 1]; //返回数组中下标为count—1的值
        count--;                      //并且count减一
        return temp;
    }
}
