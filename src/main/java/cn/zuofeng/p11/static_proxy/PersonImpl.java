package cn.zuofeng.p11.static_proxy;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/12 15:46
 * @Description:
 */
public class PersonImpl implements Person {
    @Override
    public void eat() {
        System.out.println("人在吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("人在睡觉");
    }
}
