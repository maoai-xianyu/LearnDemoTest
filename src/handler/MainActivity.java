package handler;

/**
 * @author zhangkun
 * @time 2020/3/14 9:12 上午
 */
public class MainActivity extends Activity {

    private TextView textView;

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            System.out.println("线程名称2 " + Thread.currentThread());
            String obj = (String) msg.obj;
            textView.setText(obj);
        }
    };

    @Override
    void onCreate() {
        super.onCreate();
        System.out.println("onCreate 执行");

        textView = finViewById(R.id.text_view);

        new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 更新UI必须在主线程
            //textView.setText("更新UI");
            // 改为Handler
            System.out.println("线程名称1 " + Thread.currentThread());
            Message message = new Message();
            message.obj = "更新UI";
            handler.sendMessage(message);
        }).start();
    }

    @Override
    void onResume() {
        super.onResume();
        System.out.println("onResume 执行");
    }
}
