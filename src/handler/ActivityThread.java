package handler;

/**
 * @author zhangkun
 * @time 2020/3/14 9:09 上午
 */
public class ActivityThread {

    final H mH = new H();

    public void attach(boolean b) {

        Activity mainActivity = new MainActivity();
        mainActivity.onCreate();

        // 通过handler 去执行Activity生命周期
        Message message = new Message();
        message.obj = mainActivity;
        mH.sendMessage(message);
    }

    class H extends Handler {

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            Activity mainActivity = (Activity) msg.obj;
            mainActivity.onResume();
        }
    }
}
