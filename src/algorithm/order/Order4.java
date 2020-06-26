package algorithm.order;

/**
 * @author zhangkun
 * @time 2020/6/25 10:45 上午
 * 插入排序
 */
public class Order4 {

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 7, 8, 2, 50, 30};
        insertionSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }

    }

    /**
     * 插入排序
     *
     * @param array
     * @return
     */
    public static int[] insertionSort(int[] array) {
        if (array.length == 0)
            return array;
        int current;
        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = current;
        }
        return array;
    }

}
