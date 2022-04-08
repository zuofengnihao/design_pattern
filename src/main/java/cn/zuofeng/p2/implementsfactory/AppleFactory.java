package cn.zuofeng.p2.implementsfactory;

import cn.zuofeng.p2.Apple;
import cn.zuofeng.p2.Fruit;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/8 09:51
 * @Description:
 */
public class AppleFactory implements Factory {
    @Override
    public Fruit create() {
        return new Apple();
    }
}
