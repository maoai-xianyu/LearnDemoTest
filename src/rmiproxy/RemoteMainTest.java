package rmiproxy;

import localStatePattern.CandyMachine;

import java.rmi.Naming;

/**
 * @author zhangkun
 * @time 2020/2/25 10:40 上午
 */
public class RemoteMainTest {

    public static void main(String[] args) {
        try {
            CandyMachine service = new CandyMachine("test1", 7);
            Naming.bind("rmi://127.0.0.1:6602/test1", service);
            service.insertCoin();
            service = new CandyMachine("test2", 5);
            Naming.rebind("rmi://127.0.0.1:6602/test2", service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
