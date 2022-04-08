package cn.zuofeng.p4;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/8 14:21
 * @Description:
 */
public class MilkTea {

    private String type;
    private boolean ice;

    public MilkTea clone() {
        MilkTea milkTea = new MilkTea();
        milkTea.type = this.type;
        milkTea.ice = this.ice;
        return milkTea;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isIce() {
        return ice;
    }

    public void setIce(boolean ice) {
        this.ice = ice;
    }

    @Override
    public String toString() {
        return "MilkTea{" +
                "type='" + type + '\'' +
                ", ice=" + ice +
                '}';
    }
}
