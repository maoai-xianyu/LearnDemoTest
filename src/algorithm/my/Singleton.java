package algorithm.my;

/**
 * @author zhangkun
 * @time 2020/6/18 5:47 下午
 *
 * 单例模式静态内部类
 */
public class Singleton {

    private Singleton(){}

    private static class Inner{
        private static final Singleton mInstance = new Singleton();
    }

    public static Singleton getInstance(){
        return Inner.mInstance;
    }
}
