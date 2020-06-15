package algorithm.refresh;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangkun
 * @time 2020/6/2 9:37 上午
 * <p>
 * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 * <p>
 * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 * <p>
 * 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
 */
public class Main448 {

    public static void main(String[] args) {
        int[] array = {4, 3, 2, 7, 8, 2, 3, 1};
        //array =new int[]{};
        List<Integer> disappearedNumbers = findDisappearedNumbers(array);
        System.out.println(disappearedNumbers);
        List<Integer> disappearedNumbersNew = findDisappearedNumbersNew(array);
        System.out.println(disappearedNumbersNew);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        int[] array = new int[nums.length+1];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int index : array) {
            if (index == 0) continue;
            boolean flag = true;
            for (int temp : nums) {
                if (temp == index) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                integers.add(index);
            }
        }
        return integers;
    }


    /**
     * 比较优秀
     * @param nums
     * @return
     */
    public static List<Integer> findDisappearedNumbersNew(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        boolean[] array = new boolean[nums.length+1];
        for (int num : nums) {
            array[num] = true;
        }
        for (int i = 0; i < array.length; i++) {
            if (i != 0 && !array[i]){
                integers.add(i);
            }
        }
        return integers;
    }


}