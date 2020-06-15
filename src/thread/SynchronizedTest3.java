package thread;

/**
 * @author zhangkun
 * @time 2020/6/12 10:26 上午
 */
public class SynchronizedTest3 {

    int i1 =1;

    public int getI1() {
        return i1;
    }
    // 多线程访问主内存的i1,线程A或者线程B更改了i1的值，
    // 但是没有通知主内存或者说线程A更改了i1的值没有通知其他线程，导致获取的值不一样

    volatile int i2 = 2;
    public int getI2() {
        return i2;
    }
    // 用volatile修饰时 getI2 直接从主内存中获取i2的值。在线程A或者线程B获取i2的值都是主内存的值，而不是不同线程中的值
    // 用volatile，使用多线程访问i2，线程不会把i2的值拷贝到线程中。 i2改变后，可以通知所有的线程

    int i3 =3;
    synchronized public int getI3() {
        return i3;
    }

    // synchronized 上锁一个对象，其他线程访问不了
}
