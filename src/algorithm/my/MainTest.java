package algorithm.my;

/**
 * @author zhangkun
 * @time 2020/6/25 3:36 下午
 */
public class MainTest {

    public static void main(String[] args) {
        MainTest mainTest = new MainTest();

        mainTest.foo("str");

        System.out.println("-------");

        mainTest.foo((Object) null);

        System.out.println("-------");

        A a = mainTest.new A();
        a.foo(null);

    }

    void foo(Object o) {
        System.out.println(" Object " + o);
    }

    void foo(String o) {
        System.out.println(" String " + o);
    }

    class A {

        void foo(String o) {
            System.out.println(" String " + o);
        }

        void foo(Object o) {
            System.out.println(" Object " + o);
        }


    }
}
