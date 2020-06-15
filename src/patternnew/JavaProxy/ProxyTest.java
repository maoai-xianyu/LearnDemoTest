package patternnew.JavaProxy;

/**
 * @author zhangkun
 * @time 2020-05-07 21:14
 * @Description
 */
public class ProxyTest {

    public static void main(String[] args) {
        Man man = new Man("zhangkun");
        Salesman salesman = new Salesman(man);

        salesman.applyBank();
    }
}
