package cn.zuofeng.p2.simple;

import cn.zuofeng.p2.Fruit;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/8 09:39
 * @Description:
 */
public class SimpleTest {

    public static void main(String[] args) {
        SimpleFruitFactory simpleFruitFactory = new SimpleFruitFactory();
        Fruit apple = simpleFruitFactory.create("苹果");
        Fruit banana = simpleFruitFactory.create("香蕉");

        apple.eat();
        banana.eat();

        Fruit lz = simpleFruitFactory.create("梨子");
        lz.eat();
    }
}

