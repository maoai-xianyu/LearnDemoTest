package algorithm.face;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangkun
 * @time 2020/6/25 11:25 上午
 * <p>
 * 给定无序数组和一个值，找到两个数和为值的元素，不能使用额外空间复杂度（不要使用HashMap）
 */
public class Main14 {

    public static void main(String[] args) {


    }


    // 非hashmap
    public static int[] twoSum01(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        // return null;
        throw new IllegalAccessError("No two solution");
    }


    /**
     * 两个指针二分查找
     * (排序时间复杂度为O(nlog(n)),while最多O(N)，所以最终程序的时间复杂度为：O(nlo(n)))
     *
     * @param nums
     * @param target
     */
    public static void findTwo2(int[] nums, int target) {
        // 1.排列（用的是Dual-Pivot Quicksort(快速排序),时间复杂度为O(nlog(n))）
        Arrays.sort(nums);
        // 2.类二分查找
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] > target) {// 太大 right减少
                right--;
            } else if (nums[left] + nums[right] < target) {// 太小left增加
                left++;
            } else {// 找到结果，结束查找
                System.out.println("one:" + nums[left] + " two:" + nums[right]);
                return;
            }
        }
        System.out.println("找不到这两个数");
    }

    // hashmap
    public static int[] twoSum03(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
