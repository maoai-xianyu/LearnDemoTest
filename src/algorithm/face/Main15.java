package algorithm.face;

/**
 * @author zhangkun
 * @time 2020/6/28 5:56 下午
 */
public class Main15 {

    public static void main(String[] args) {
        int[] array = {2, 5, 3, 7, 90, 2};
        sort(array);
        for (int i : array) {
            System.out.print(i + ",");
        }
        System.out.println("---------");
        int[] array1 = {2, 5, 3, 7, 90, 2};
        sort1(array1);

        for (int i : array1) {
            System.out.print(i + ",");
        }
        System.out.println("---------");

        int[] array2 = {2, 5, 3, 7, 90, 2};
        sort2(array2);
        for (int i : array2) {
            System.out.print(i + ",");
        }

        System.out.println("---------");
        int[] array3 = {2, 5, 3, 7, 90, 2};

        int left = 0;
        int right = array3.length - 1;
        sort3(array3, left, right);
        for (int i : array3) {
            System.out.print(i + ",");
        }
    }

    // 冒泡
    public static int[] sort(int[] array) {
        if (array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    // 选择
    public static int[] sort1(int[] array) {
        if (array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }

    // 插入
    public static int[] sort2(int[] array) {
        if (array.length == 0) {
            return array;
        }
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

    // 快速
    public static int[] sort3(int[] array, int start, int end) {
        if (array.length < 1 || start < 0 || end >= array.length || start > end)
            return null;
        int smallIndex = index(array, start, end);
        if (smallIndex > start) {
            sort3(array, start, smallIndex - 1);
        }
        if (smallIndex < end) {
            sort3(array, smallIndex + 1, end);
        }
        return array;
    }


    public static int index(int[] array, int start, int end) {
        int point = (int) (start + Math.random() * (end - start + 1));
        swap(array, point, end);
        int smallIndex = start - 1;
        for (int i = start; i <= end; i++) {
            if (array[i] <= array[end]) {
                smallIndex++;
                if (i > smallIndex) {
                    swap(array, i, smallIndex);
                }
            }
        }
        return smallIndex;
    }

    public static void swap(int[] array, int start, int end) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }


}
