package algorithm.face;

/**
 * @author zhangkun
 * @time 2020/6/15 11:23 上午
 */
public class Main03 {

    public static void main(String[] args) {

        Main03 threadTest = new Main03();

        MyRunnable myRunnable = threadTest.new MyRunnable();

        for (int i = 0; i < 5; i++) {
            new Thread(myRunnable).start();
        }
    }

    public int i = 0;
    class MyRunnable implements Runnable {
        @Override
        public void run() {
            while (true) {
                //锁住的是同一对象
                synchronized (this) {
                    if (i >= 1000) {
                        break;
                    }
                    System.out.println(Thread.currentThread().getName() + ":count:" + (++i));
                    //测试时，线程更容易切换
                    //Thread.yield();
                }
            }
        }
    }

}
