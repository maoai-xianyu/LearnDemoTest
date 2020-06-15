package handler;

/**
 * @author zhangkun
 * @time 2020/3/14 9:29 上午
 */
public class Instance {

    private Instance() {
    }

    private final static class Test {
        private static Instance instance = new Instance();
    }

    public static Instance getInstance() {
        return Test.instance;
    }
}
