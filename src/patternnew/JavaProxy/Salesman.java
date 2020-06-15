package patternnew.JavaProxy;

/**
 * @author zhangkun
 * @time 2020-05-07 21:12
 * @Description
 */
public class Salesman implements IBank {

    private IBank mIBank;

    public Salesman(IBank IBank) {
        mIBank = IBank;
    }

    @Override
    public void applyBank() {

        System.out.println("银行业务员开始办理业务");
        mIBank.applyBank();
        System.out.println("银行业务员结束办理业务");
    }

    @Override
    public void loseBank() {
        System.out.println("银行业务员开始处理用户丢卡片办理业务");
        mIBank.loseBank();
        System.out.println("银行业务员结束处理用户丢卡片办理业务");
    }
}
