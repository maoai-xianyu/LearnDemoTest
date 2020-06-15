package patternnew.dynamic;

import patternnew.JavaProxy.IBank;
import patternnew.JavaProxy.Man;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhangkun
 * @time 2020/5/7 11:04 下午
 */
public class DynamicClient {

    public static void main(String[] args) {

        Man man = new Man("动态");

        // 获取代理  代理了所有的方法  会走 InvocationHandler 里面的 invoke 方法
        IBank proxyInstance = (IBank) Proxy.newProxyInstance(
                man.getClass().getClassLoader(), // 第一个参数
                man.getClass().getInterfaces(), // 接口类数据组
                new BankInvocationHandler(man)// 回调
        );

        // 动态代理，解析interface所有方法，新建一个class，class的名  包名+$Proxy，
        // 实例化了proxy对象，proxy的里面包含InvocationHandler,
        // 每次调方法其实执行的是InvocationHandler里面的invoke

        proxyInstance.applyBank();
        System.out.println("---------");
        proxyInstance.loseBank();

    }

    private static class BankInvocationHandler implements InvocationHandler {

        private Object target; // 要代理的真是对象

        public BankInvocationHandler(Object target) {
            this.target = target;
        }

        /**
         *
         * @param proxy  代理对象
         * @param method
         * @param args
         * @return
         * @throws Throwable
         */
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            System.out.println("方法执行"+method.getName());
            System.out.println("before...");
            Object invoke = method.invoke(target, args);
            System.out.println("after...");
            // 方法回调  方法执行还是要 Man执行
            return invoke;
        }
    }
}
