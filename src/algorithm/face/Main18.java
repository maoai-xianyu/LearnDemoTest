package algorithm.face;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhangkun
 * @time 2020/7/6 12:30 上午
 */
public class Main18 {

    public static void main(String[] args) {
        array1();
        array2();
        array3();
    }

    public static void array1() {
        String[] a = {"A", "B", "C"};
        String[] b = {"D", "E"};

        List list = new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        String[] str = new String[list.size()];
        list.toArray(str);
        for (int x = 0; x < str.length; x++) {
            System.out.print(str[x] + " ");
        }
    }

    public static void array2() {
        //方法二  循环遍历
// 两个数组合并
        String[] str1 = {"Hello", "world", "java"};
        String[] str2 = {"Veriable", "syntax", "interator"};
        String[] newStr = new String[str1.length + str2.length];
        //newStr = str1;数组是引用类型
        for (int x = 0; x < str1.length; x++) {
            newStr[x] = str1[x];
        }
        for (int y = 0; y < str2.length; y++) {
            newStr[str1.length + y] = str2[y];
        }
        for (int y = 0; y < newStr.length; y++) {
            System.out.println(newStr[y] + " ");
        }
    }

    public static void array3() {
        // 方法三
        String[] str1 = {"Hello", "world", "java"};
        String[] str2 = {"Veriable", "syntax", "interator"};
        int str1Length = str1.length;
        int str2length = str2.length;

        str1 = Arrays.copyOf(str1, str1Length + str2length);//数组扩容
        System.arraycopy(str2, 0, str1, str1Length, str2length);
        System.out.println(Arrays.toString(str1));
    }
}
