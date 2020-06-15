package patternnew.JavaProxy;

/**
 * @author zhangkun
 * @time 2020-05-07 21:11
 * @Description
 */
public class Man implements IBank {


    private String name;

    public Man(String name) {
        this.name = name;
    }

    @Override
    public void applyBank() {
        System.out.println("客户"+name+"输入客户密码");
    }

    @Override
    public void loseBank() {
        System.out.println("客户"+name+"丢了卡片，输入客户密码");
    }
}
