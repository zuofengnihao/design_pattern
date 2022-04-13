package cn.zuofeng.p11.dynamic_proxy;

import cn.zuofeng.p3.MilkTea;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/13 15:26
 * @Description:
 */
public class HelloImpl implements IHello{
    @Override
    public void sayHello() {
        System.out.println("hello world!");
    }

    @Override
    public void whoSay(String name) {
        System.out.println(name + " : hello world!");
    }

    @Override
    public String sayWords(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int j = 0; j < i; j++) {
            stringBuffer.append("hello world!");
        }
        return stringBuffer.toString();
    }
}
