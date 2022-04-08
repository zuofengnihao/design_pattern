package cn.zuofeng.p2.simple;

import cn.zuofeng.p2.Apple;
import cn.zuofeng.p2.Banana;
import cn.zuofeng.p2.Fruit;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/8 09:34
 * @Description:
 */
public class SimpleFruitFactory {

    public Fruit create(String type) {
        switch (type) {
            case "苹果":
                return new Apple();
            case "香蕉":
                return new Banana();
            default:
                throw new RuntimeException("没有的水果类型");
        }
    }
}
