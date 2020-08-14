package javaP.p2;

import javaP.p1.Son1;

/**
 * @author zhangkun
 * @time 2020/8/6 2:34 下午
 */
public class Test2 {
    public static void main(String[] args) {
        Son1 son1 = new Son1();
        //son1.f(); // 调用不到
        Son2 son2 = new Son2();
        // son2.f(); // 调用不到
    }
}
