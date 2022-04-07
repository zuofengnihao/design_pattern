package cn.zuofeng.p1;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/7 14:28
 * @Description:
 *
 * 最简单的单例模式，私有化Construction构造方法，返回一个静态对象，饿汉模式
 * 有点是线程安全 缺点是对象如果一直不被使用会占用内存
 */
public class Singleton1 {

    private static Singleton1 singleton = new Singleton1();

    private Singleton1() {}

    public static Singleton1 getSingleton1() {
        return singleton;
    }
}
