package thread;

/**
 * @author zhangkun
 * @time 2020/6/12 10:26 上午
 */
public class SynchronizedTest1 {

    synchronized public void meathodA(){
    }
    // 两个效果是一样的
    public void meathodB(){
        synchronized (this){

        }
    }
}
