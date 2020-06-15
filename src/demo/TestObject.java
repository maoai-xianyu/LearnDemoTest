package demo;

/**
 * Created by zhangkun
 * on 2018/4/13.
 */
public class TestObject {
    public static void main(String[] args) {
        Info info = new Info();

        if (info != null) {

        }


        double ceil = Math.ceil(4 * 50 / 24);

        System.out.println("ss"+ceil/100);


        double ceil1 = Math.ceil(0.01);
        double ceil2 = Math.floor(0.01);
        double ceil3 = Math.rint(0.01);
        double ceil4 = Math.round(0.01);
        double ceil5 = Math.ceil(0.00);

        System.out.println("ceil1"+ceil1);
        System.out.println("ceil2"+ceil2);
        System.out.println("ceil3"+ceil3);
        System.out.println("ceil4"+ceil4);
        System.out.println("ceil5"+ceil5);

        double mEqualScore = (double) 1 / 100;
        double mEqualScore1 =  1.3 / 100;
        System.out.println("mEqualScore"+mEqualScore);
        System.out.println("mEqualScore1"+mEqualScore1);


    }
}
