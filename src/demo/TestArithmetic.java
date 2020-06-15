package demo;

/**
 * create by zhangkun .
 * on 2018/11/29
 */
public class TestArithmetic {

    public static void main(String[] args) {

        float mm = 0.356f;

        float nn = mm * 100;

        float xx = 0.12f;

        float yy = xx * 100;

        System.out.println(" nn " + nn + " yy " + yy);
        test();


    }

    private static int test() {

        int i = 0;
        int[] arr = {1, 2, 0};
        for (; i <= 3; i++) {
            arr[i] = 0;
            System.out.println("hello world");
        }

        return 0;
    }

}
