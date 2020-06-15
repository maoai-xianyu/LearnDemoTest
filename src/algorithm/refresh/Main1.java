package algorithm.refresh;

/**
 * @author zhangkun
 * @time 2020/6/2 10:27 上午
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 */
public class Main1 {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ints = twoSum(nums, target);

        System.out.println(ints);
    }

    public static int[] twoSum(int[] nums, int target) {
        if (nums.length == 0) return nums;
        int[] result = new int[2];

        outer:
        for (int i = 0; i < nums.length; i++) {
            int first = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int second = nums[j];
                if (first + second == target) {
                    result[0] = i;
                    result[1] = j;
                    break outer;
                }
            }
        }

        return result;
    }
}
