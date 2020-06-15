package rmiproxy;

import localStatePattern.StateMode;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author zhangkun
 * @time 2020/2/24 9:25 下午
 */
public interface CandyMachineRemote extends Remote {

    public String getLocation() throws RemoteException;

    public int getCount() throws RemoteException;

    public StateMode getState() throws RemoteException;
}
