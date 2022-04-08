package cn.zuofeng.p2.implementsfactory;

import cn.zuofeng.p2.Banana;
import cn.zuofeng.p2.Fruit;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/8 09:51
 * @Description:
 */
public class BananaFactory implements Factory{
    @Override
    public Fruit create() {
        return new Banana();
    }
}
