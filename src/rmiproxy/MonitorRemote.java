package rmiproxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.ArrayList;

/**
 * @author zhangkun
 * @time 2020/2/25 10:30 上午
 */
public class MonitorRemote {

    private ArrayList<CandyMachineRemote> candyMachineRemotes;

    public MonitorRemote() {
        candyMachineRemotes = new ArrayList<>();
    }
    
    public void addMachine(CandyMachineRemote candyMachineRemote){
        candyMachineRemotes.add(candyMachineRemote);
    }
    
    public void report(){
        CandyMachineRemote candyMachineRemote;
        for (int i = 0; i < candyMachineRemotes.size(); i++) {
            candyMachineRemote = candyMachineRemotes.get(i);
            try {
                System.out.println("Machine loc:"+candyMachineRemote.getLocation());
                System.out.println("Machine count:"+candyMachineRemote.getCount());
                System.out.println("Machine state:"+candyMachineRemote.getState().getStateName());
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }
}
