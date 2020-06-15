package algorithm.face;

import java.util.Arrays;

/**
 * @author zhangkun
 * @time 2020/6/15 11:35 上午
 * 算法题：1到100之间缺失的数字
 * Input: [3,0,1]
 * Output: 2
 */
public class Main07 {

    /***
     * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
     *  find the one that is missing from the array.
     *  Input: [3,0,1]
     *  Output: 2
     *
     *  思路1.算出数组的和，可以找出缺少的那个
     *  思路2.排序后二分法查找
     *  思路3.与法
     */
    //first
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int low = 0, high = nums.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > mid) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    //和法
    public static int missingNumber2(int[] nums) {
        int res = (nums.length) * (nums.length + 1) / 2;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return res - sum;
    }

    //与法
    public static int missingNumber3(int[] nums) {
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
            res ^= i;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 8, 5, 7, 0, 1};
        System.out.println(missingNumber3(nums));
        System.out.println(missingNumber2(nums));
        System.out.println(missingNumber(nums));
    }

}
