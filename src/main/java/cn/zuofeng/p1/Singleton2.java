package cn.zuofeng.p1;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/7 14:36
 * @Description:
 *
 * 懒汉模式 私有化构造方法，第一次获取时创建实例
 * 这个不是线程安全的
 */
public class Singleton2 {

    private static Singleton2 singleton2;

    private Singleton2() {}

    public static Singleton2 getSingleton2() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
