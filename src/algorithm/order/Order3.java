package algorithm.order;

/**
 * @author zhangkun
 * @time 2020/6/25 10:45 上午
 * 选择排序
 */
public class Order3 {

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 7, 8, 2, 50, 30};
        selectionSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }

    }


    /**
     * 选择排序
     *
     * @param array
     * @return
     */
    public static int[] selectionSort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) //找到最小的数
                    minIndex = j; //将最小数的索引保存
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
