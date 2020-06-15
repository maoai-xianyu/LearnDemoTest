package algorithm.face;

/**
 * @author zhangkun
 * @time 2020/6/5 11:08 上午
 *
 * 算法:java多线程累加计数 给定count=0；让5个线程并发累加到1000；
 */
public class Main02 {

    public static void main(String[] args) {

        int[] index = new int[1];
        Runnable runnable = () -> {
            while (true) {
                synchronized (Main02.class) {
                    if (index[0] >= 1000) {
                        System.exit(0);
                        break;
                    }
                    System.out.println(Thread.currentThread().getName() + " index " + (++index[0]));
                }
            }
        };
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }


}
