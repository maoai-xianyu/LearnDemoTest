package math;

/**
 * @author zhangkun
 * @time 2020/7/8 9:09 上午
 */
public class Main {


    public static void main(String[] args) {

        Integer integer1 = Integer.valueOf(100);
        Integer integer2 = Integer.valueOf(100);
        System.out.println(integer1 == integer2);//  true

        Integer integer3 = Integer.valueOf(200);
        Integer integer4 = Integer.valueOf(200);
        System.out.println(integer3 == integer4); // false


        System.out.println(new String("abc")=="abc"); // false


        System.out.println(Integer.valueOf("127")==Integer.valueOf("127"));  // true
        System.out.println(Integer.valueOf("128")==Integer.valueOf("128")); // false

        int anInt = Integer.parseInt("128");
        Integer integer = Integer.valueOf("128");
        System.out.println(anInt+" == "+integer +"  "+(anInt == integer)); // true


        String str1 = "abcd";
        String str2 = "abcd";
        String str3 = new String("abcd");
        System.out.println(str1 == str2);//
        System.out.println(str1 == str3);

    }
}
