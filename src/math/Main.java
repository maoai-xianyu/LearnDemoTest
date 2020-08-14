package math;

/**
 * @author zhangkun
 * @time 2020/7/8 9:09 上午
 */
public class Main {
    public static void main(String[] args) {
        Integer integer1 = Integer.valueOf(100);
        Integer integer2 = Integer.valueOf(100);
        System.out.println(integer1 == integer2);//  true 因为 100 在 -128~127 之间，进行了缓存，所以地址空间一样

        Integer integer3 = Integer.valueOf(200);
        Integer integer4 = Integer.valueOf(200);
        System.out.println(integer3 == integer4); // false 因为 200 不在 -128~127 之间，新创建了new Integer,所以地址空间不一样

        System.out.println(new String("abc") == "abc"); // false

        System.out.println(Integer.valueOf("127") == Integer.valueOf("127"));  // true
        System.out.println(Integer.valueOf("128") == Integer.valueOf("128")); // false

        int anInt = Integer.parseInt("128");
        Integer integer = Integer.valueOf("128"); // int 和 Integer 比较，Integer 拆箱
        System.out.println(anInt + " == " + integer + "  " + (anInt == integer)); // true

        String str1 = "abcd";
        String str2 = "abcd";
        String str3 = new String("abcd");
        System.out.println(str1 == str2);// true
        System.out.println(str1 == str3); // fasle
    }
}
