package algorithm.face;

/**
 * @author zhangkun
 * @time 2020/7/6 8:53 下午
 */
public class Main20 {

    public static void main(String[] args) {
        print(5);
        print1();
        print2(10);
    }

    public static void print(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i - 1; k++) {
                System.out.print("1 ");
            }
            System.out.println();
        }
    }


    public static void print1() {
        for (int x = 0; x < 5; x++) {
            for (int y = x + 1; y < 5; y++) {
                System.out.print(" ");
            }
            for (int z = 0; z <= x; z++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void print2(int n) {
        for (int x = 0; x < n; x++) {
            for (int y = x + 1; y < n; y++) {
                System.out.print(" ");
            }
            for (int z = 0; z <= x; z++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
