package algorithm.my;

/**
 * @author zhangkun
 * @time 2020/6/18 5:46 下午
 * 单例模式 - DCL
 */
public class SingleTonDCL {

    private static volatile SingleTonDCL mInstance = null;

    private SingleTonDCL() {

    }
    public static SingleTonDCL getInstance() {
        if (mInstance == null) {
            synchronized (SingleTonDCL.class) {
                if (mInstance == null) {
                    mInstance = new SingleTonDCL();
                }
            }
        }
        return mInstance;
    }
}
