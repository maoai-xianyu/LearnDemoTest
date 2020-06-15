package algorithm.face;

/**
 * @author zhangkun
 * @time 2020/6/15 11:29 上午
 * 算法题：数组中两个字符串的最小距离
 * 举例：String[] str = {"1","3","3","3","2","3","1"};str1="1",str2="2";返回2
 * last1最近一次出现str1的位置，last2最近一次出现str2的位置
 */
public class Main05 {

    public static void main(String[] args) {
        String[] str = {"1","3","3","3","2","3","1"};
        int dis = minDistance(str,"1","2");
        System.out.println("最小距离 "+dis);
    }

    public static int minDistance(String[] str, String str1, String str2) {

        if (str == null || str.length == 0 || str1 == null || str2 == null) {
            return 0;
        }
        if (str1 == str2) {
            return 0;
        }
        int last1 = -1;
        int last2 = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == str1) {
                min = Math.min(min, last2 == -1 ? min : i - last2);
                last1 = i;
            }
            if (str[i] == str2) {
                min = Math.min(min, last1 == -1 ? min : i - last1);
                last2 = i;
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
