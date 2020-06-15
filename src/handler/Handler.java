package handler;

/**
 * @author zhangkun
 * @time 2020/3/14 9:09 上午
 */
public class Handler {

    MessageQueue mQueue;

    public Handler() {
        Looper looper = Looper.myLooper();
        if (looper == null) {
            throw new RuntimeException(
                    "Can't create handler inside thread " + Thread.currentThread()
                            + " that has not called Looper.prepare()");
        }
        mQueue = looper.mQueue;
        System.out.println("handler MessageQueue mQueue " + mQueue);
    }

    public void handleMessage(Message msg) {
    }

    public final boolean sendMessageDelayed(Message msg, long delayMillis) {
        if (delayMillis < 0) {
            delayMillis = 0;
        }
        return sendMessageAtTime(msg, System.currentTimeMillis() + delayMillis);
    }

    public boolean sendMessageAtTime(Message msg, long uptimeMillis) {
        MessageQueue queue = mQueue;
        System.out.println("handler MessageQueue " + queue);
        return enqueueMessage(queue, msg, uptimeMillis);
    }

    private boolean enqueueMessage(MessageQueue queue, Message msg, long uptimeMillis) {
        msg.target = this;
        boolean b = queue.enqueueMessage(msg, uptimeMillis);
        System.out.println("handler MessageQueue " + queue);
        return b;
    }

    public final void sendMessage(Message msg) {
        sendMessageDelayed(msg, 0);
    }

}
