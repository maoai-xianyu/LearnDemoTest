package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author zhangkun
 * @time 2020/2/24 2:17 下午
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    protected MyRemoteImpl() throws RemoteException {
        super();
    }

    @Override
    public String syaHello() throws RemoteException {
        return "hello word";
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            // 注册接口
            LocateRegistry.createRegistry(6600);
            Naming.rebind("RemoteHello", service);
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }
}
