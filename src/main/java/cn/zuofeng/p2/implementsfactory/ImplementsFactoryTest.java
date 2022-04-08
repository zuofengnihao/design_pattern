package cn.zuofeng.p2.implementsfactory;

import cn.zuofeng.p2.Fruit;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/8 09:52
 * @Description:
 */
public class ImplementsFactoryTest {

    public static void main(String[] args) {
        Factory factory1 = new AppleFactory();
        Factory factory2 = new BananaFactory();

        Fruit fruit1 = factory1.create();
        Fruit fruit2 = factory2.create();

        fruit1.eat();
        fruit2.eat();
    }
}
