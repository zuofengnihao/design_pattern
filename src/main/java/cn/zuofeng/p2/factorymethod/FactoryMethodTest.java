package cn.zuofeng.p2.factorymethod;

import cn.zuofeng.p2.Fruit;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/8 09:49
 * @Description:
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        AppleFactory appleFactory = new AppleFactory();
        Fruit apple = appleFactory.create();
        BananaFactory bananaFactory = new BananaFactory();
        Fruit banana = bananaFactory.create();

        apple.eat();
        banana.eat();
    }
}
