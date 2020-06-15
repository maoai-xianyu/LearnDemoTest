package algorithm.face;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zhangkun
 * @time 2020/6/5 10:54 上午
 * 算法:java多线程累加计数 给定count=0；让5个线程并发累加到1000；
 */
public class Main01 {
    static ThreadPoolExecutor threadPoolExecutor;
    private static final BlockingQueue<Runnable> sPoolWorkQueue =
            new LinkedBlockingQueue<Runnable>(128); // 存放 Runnable 对象 128个

    static {
        threadPoolExecutor = new ThreadPoolExecutor(
                5,//CORE_POOL_SIZE, // 核心线程数，就是线程池里面的核心线程数量 手机cpu核数+1
                10,//MAXIMUM_POOL_SIZE, // 最大线程数，线程池中最大线程数,
                60,//KEEP_ALIVE_SECONDS, // 线程存活的时间，没事干的时候的空闲存活时间，超过这个时间线程就会被销毁
                TimeUnit.SECONDS, // 线程存活的时间的单位
                sPoolWorkQueue, // 线程的队列
                new ThreadFactory() {  // 线程创建工厂，如果线程池需要创建线程，就会调用 newThread 来创建
                    private final AtomicInteger mCount = new AtomicInteger(1);

                    @Override
                    public Thread newThread(Runnable r) {
                        Thread thread = new Thread(r, "Thread-- #" + mCount.getAndIncrement());
                        thread.setDaemon(false); // 不是守护线程
                        return thread;
                    }
                });
    }


    public static void main(String[] args) {
        downloadImagePool();
    }

    public static void downloadImagePool() {
        final int[] index = {0};
        for (int i = 0; i < 20; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        synchronized (Main01.class) {
                            if (index[0] >= 1000) {
                                threadPoolExecutor.shutdown();
                                break;
                            }
                            System.out.println(Thread.currentThread().getName() + " index" + (++index[0]));
                        }
                    }
                }
            };
            // 加入线程队列，寻找合适的时机去执行
            threadPoolExecutor.execute(runnable);
        }
    }

}

