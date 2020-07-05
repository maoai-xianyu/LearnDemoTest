package algorithm.face;

/**
 * @author zhangkun
 * @time 2020/7/5 10:18 下午
 * <p>
 * <p>
 * 实现String字符串反转
 */
public class Main17 {

    public static void main(String[] args) {
        String str1 = reverse("HellowWorld");
        System.out.println(str1);
    }

    //方法一
    public static String reverse(String str) {
        char[] ch = str.toCharArray();
        for (int x = 0, y = ch.length - 1; x < y; x++, y--) {
            char temp = ch[x];
            ch[x] = ch[y];
            ch[y] = temp;
        }
        return new String(ch);
    }

    //方法二
    public static String reverse1(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        StringBuilder str2 = stringBuilder.reverse();
        return str2.toString();
    }

    //方法三
    public static String  reverse2(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length()-1; i >=0 ; i--) {
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }
}
