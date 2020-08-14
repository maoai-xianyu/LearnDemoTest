package algorithm.face;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author zhangkun
 * @time 2020/7/16 6:37 下午
 */
public class Main26 {


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(moreHalfNum1(array));
        System.out.println("************");
        System.out.println(moreHalfNum2(array));
    }

    public static int moreHalfNum1(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[arr.length / 2]) {
                count++;
            }
        }
        if (count > arr.length / 2) {
            return arr[arr.length / 2];
        }
        return 0;
    }

    public static int moreHalfNum2(int[] arr) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Integer integer = hashMap.get(arr[i]);
            if (integer == null){
                hashMap.put(arr[i],1);
            }else {
                hashMap.put(arr[i],integer.intValue()+1);
            }
            Integer temp = hashMap.get(arr[i]);
            if (temp > arr.length/2){
                return arr[i];
            }

        }
        return 0;
    }
}
