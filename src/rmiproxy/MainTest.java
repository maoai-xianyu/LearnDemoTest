package rmiproxy;

import localStatePattern.CandyMachine;

import java.rmi.Naming;

/**
 * @author zhangkun
 * @time 2020/2/24 9:46 下午
 */
public class MainTest {

    public static void main(String[] args) {
        MonitorRemote monitorRemote = new MonitorRemote();
        try {
            CandyMachineRemote candyMachineRemote = (CandyMachineRemote) Naming.lookup("rmi://127.0.0.1:6602/test1");
            monitorRemote.addMachine(candyMachineRemote);
            candyMachineRemote = (CandyMachineRemote) Naming.lookup("rmi://127.0.0.1:6602/test2");
            monitorRemote.addMachine(candyMachineRemote);
        } catch (Exception e) {
            e.printStackTrace();
        }
        monitorRemote.report();
    }
}
