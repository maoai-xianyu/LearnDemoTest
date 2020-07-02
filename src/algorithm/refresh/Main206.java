package algorithm.refresh;

/**
 * @author zhangkun
 * @time 2020/7/1 10:03 下午
 * <p>
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，
 * 找出该数组中满足其和 ≥ s 的长度最小的连续子数组，
 * 并返回其长度。如果不存在符合条件的连续子数组，返回 0。
 */
public class Main206 {

    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 2, 4, 3};

        int i = minSubArrayLen(7, nums);
        System.out.println("i   == "+i);

    }

    public static int minSubArrayLen(int s, int[] nums) {
        int i = 0;
        int len = 0;
        int sum = 0;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum >= s) {
                len = len == 0 ? j - i + 1 : Math.min(len, j - i + 1);
                sum -= nums[i++];
            }
        }
        return len;
    }
}
