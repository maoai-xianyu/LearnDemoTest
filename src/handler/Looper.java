package handler;

/**
 * @author zhangkun
 * @time 2020/3/14 9:12 上午
 */
public class Looper {


    static final ThreadLocal<Looper> sThreadLocal = new ThreadLocal<Looper>();
    MessageQueue mQueue;

    public static void prepare() {
        sThreadLocal.set(new Looper());
    }

    public Looper() {
        mQueue = new MessageQueue();
        System.out.println("Looper mQueue " + mQueue);
    }

    public static void loop() {
        Looper looper = myLooper();
        for (; ; ) {
            MessageQueue queue = looper.mQueue;
            System.out.println("Looper  queue " + queue);
            Message message = queue.next();
            System.out.println("Looper message " + message);
            if (message == null) {
                return;
            }
            message.target.handleMessage(message);
        }

    }

    public static Looper myLooper() {
        Looper looper = sThreadLocal.get();
        return looper;
    }
}
