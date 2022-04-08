package cn.zuofeng.p4;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/8 14:23
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        MilkTea milkTea = new MilkTea();
        milkTea.setType("珍珠奶茶");
        milkTea.setIce(true);

        MilkTea cloneMilkTea = milkTea.clone();

        System.out.println("source milkTea ： " + milkTea);
        System.out.println("clone milkTea ： " + cloneMilkTea);
        System.out.println("source == clone ? " + (milkTea == cloneMilkTea));

    }
}
