package thread;

/**
 * @author zhangkun
 * @time 2020/6/12 10:26 上午
 */
public class SynchronizedTest {
    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        // ThreadA 和 ThreadB 持有的是同一个对象 myObject 共享内存的通信
        ThreadA threadA = new ThreadA(myObject);
        ThreadB threadB = new ThreadB(myObject);
        threadA.start();
        threadB.start();
    }
}

class MyObject {
    synchronized public void methodA(){
        System.out.println("methodA");
    }
    synchronized public void methodB(){
        System.out.println("methodB");
    }
}

class ThreadA extends Thread{
    private MyObject myObject;
    public ThreadA(MyObject myObject) {
        this.myObject = myObject;
    }
    @Override
    public void run() {
        super.run();
        myObject.methodA();
    }
}

class ThreadB extends Thread{
    private MyObject myObject;
    public ThreadB(MyObject myObject) {
        this.myObject = myObject;
    }
    @Override
    public void run() {
        super.run();
        myObject.methodB();
    }
}