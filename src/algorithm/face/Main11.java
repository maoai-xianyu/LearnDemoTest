package algorithm.face;

/**
 * @author zhangkun
 * @time 2020/6/15 11:51 上午
 *
 * 算法:牛客网 input n=3 print 1 2 3 8 9 4 7 6 5
 * 设计一个Java程序，打印N阶螺旋矩阵：但n=3时则
 * 1 2 3
 * 8 9 4
 * 7 6 5
 *
 */
public class Main11 {
    public static void main(String[] args) {
        print(3);
    }

    public static int getNum(int n, int i, int j) {
        if (i == 0) {
            return j + 1;
        } else if (i == n - 1) {
            return 3 * n - j - 2;
        } else if (j == 0) {
            return 4 * n - i - 3;
        } else if (j == n - 1) {
            return n + 1;
        } else {
            return 4 * (n - 1) + getNum(n - 2, i - 1, j - 1);
        }
    }

    public static void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d", getNum(n, i, j));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
