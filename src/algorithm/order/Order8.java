package algorithm.order;

import java.util.Arrays;

/**
 * @author zhangkun
 * @time 2020/6/25 10:45 上午
 * 计数排序
 */
public class Order8 {

    public static void main(String[] args) {
        int[]  array= {2, 4, 6, 7, 8, 2, 50, 30};
        array = CountingSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }

    }

    /**
     * 计数排序
     *
     * @param array
     * @return
     */
    public static int[] CountingSort(int[] array) {
        if (array.length == 0) return array;
        int bias, min = array[0], max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
        }
        bias = 0 - min;
        int[] bucket = new int[max - min + 1];
        Arrays.fill(bucket, 0);
        for (int i = 0; i < array.length; i++) {
            bucket[array[i] + bias]++;
        }
        int index = 0, i = 0;
        while (index < array.length) {
            if (bucket[i] != 0) {
                array[index] = i - bias;
                bucket[i]--;
                index++;
            } else
                i++;
        }
        return array;
    }

}
