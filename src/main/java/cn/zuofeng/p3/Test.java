package cn.zuofeng.p3;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/8 13:38
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        MilkTea.Builder builder = new MilkTea.Builder("珍珠奶茶");
        MilkTea milkTea = builder.ice(true).pearl(true).size("大杯").build();
        System.out.println(milkTea);
    }
}
