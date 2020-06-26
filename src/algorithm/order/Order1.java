package algorithm.order;

/**
 * @author zhangkun
 * @time 2020/6/25 10:21 上午
 * <p>
 * 冒泡排序
 */
public class Order1 {

    public static void main(String[] args) {

        int[] array = {2, 4, 6, 7, 8, 2, 50, 30};
        sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }

    }


    static int[] sort(int[] array) {
        // 修剪枝叶的优化方法
        // 基于原理：
        // 每一趟完整的循环就对完成一个最大值或者最小值的放置
        // 那每一趟都可以删去枝叶，也就是最大值或者最小值的位置
        // i的大小也同样可以确定已经完成排序的数值的个数
        if (array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
