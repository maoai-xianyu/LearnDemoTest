package handler;

/**
 * @author zhangkun
 * @time 2020/3/14 9:12 上午
 */
public class TextView {

    private Thread mCurrentThread;

    public TextView() {
        mCurrentThread = Thread.currentThread();
    }

    public void setText(CharSequence charSequence) {
        checkThread();

        System.out.println("更新UI成功 " + charSequence);
    }


    void checkThread() {
        if (mCurrentThread != Thread.currentThread()) {
            throw new RuntimeException(
                    "Only the original thread that created a view hierarchy can touch its views."
            );
        }
    }
}
