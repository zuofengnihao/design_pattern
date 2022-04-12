package cn.zuofeng.p3;

import cn.zuofeng.p3.MilkTea.*;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/8 13:38
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        Builder milkTeaBuild = new Builder("波霸奶茶").size("大杯").pearl(true).ice(false);
        MilkTea milkTea = milkTeaBuild.build();
        System.out.println(milkTea);
    }
}
