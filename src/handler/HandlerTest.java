package handler;

/**
 * @author zhangkun
 * @time 2020/3/14 9:11 上午
 */
public class HandlerTest {

    public static void main(String[] args) {
        Looper.prepare();

        ActivityThread thread = new ActivityThread();
        thread.attach(false);

        Looper.loop();
    }


}
