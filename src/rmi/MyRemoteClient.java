package rmi;

import java.rmi.Naming;

/**
 * @author zhangkun
 * @time 2020/2/24 2:24 下午
 */
public class MyRemoteClient {

    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1:6600/RemoteHello");
            String s = service.syaHello();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
