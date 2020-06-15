package algorithm.face;

/**
 * @author zhangkun
 * @time 2020/6/15 11:49 上午
 *
 * 输入一个整形数组，数组里有正数也有负数。数组中连续的一个或多个整数组成一个子数组，每个子数组都有一个和。
 * 求所有子数组的和的最大值。要求时间复杂度为O(n)。
 * 例如输入的数组为1, -2, 3, 10, -4, 7, 2, -5，
 * 那么该数组中连续的最大的子数组为3, 10, -4, 7, 2，因此输出为该子数组的和18。
 */
public class Main10 {

    static int maxSubSum(int[] a) {
        int len = a.length;
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < len; i++) {
            sum += a[i];
            if (sum > 0) {
                if (sum > maxSum) {
                    maxSum = sum;
                }
            } else {
                sum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] a = {1, -2, 3, 10, -4, 7, 2, -5};
        int sum = maxSubSum(a);
        System.out.println("最大的子数组"+sum);
    }
}
