package cn.zuofeng.p2.factorymethod;

import cn.zuofeng.p2.Apple;
import cn.zuofeng.p2.Fruit;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/8 09:47
 * @Description:
 */
public class AppleFactory {
    public Fruit create() {
        return new Apple();
    }
}
