package localStatePattern;

import java.io.Serializable;

/**
 * @author zhangkun
 * @time 2020-02-23 19:26
 */
public interface StateMode extends Serializable {
    public void insertCoin();

    public void returnCoin();

    public void turnCrank();

    public void dispense();

    public void printstate();

    public String getStateName();

}
