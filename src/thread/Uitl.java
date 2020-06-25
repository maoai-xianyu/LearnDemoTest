package thread;

/**
 * @author zhangkun
 * @time 2020/6/24 10:09 上午
 * 泛型类-泛型方法
 */
public class Uitl {

    public <T> void show(T t) {
        System.out.println("show" + t);
    }

    public <T> T showDisPlay(T t) {
        return t;
    }
}