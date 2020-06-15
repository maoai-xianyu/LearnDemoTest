package algorithm.faceTest;

/**
 * @author zhangkun
 * @time 2020/6/2 10:19 上午
 *
 * 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 */
public class Face40 {
    public static void main(String[] args) {
        int i = sumNums(6);
        System.out.println(i);
    }

    public static int sumNums(int n) {
        return (int) (Math.pow(n, 2) + n) >> 1;
    }
}
