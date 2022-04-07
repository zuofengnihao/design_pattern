package cn.zuofeng.p1;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/7 14:39
 * @Description:
 * singleton2中的懒汉模式并非线程安全的获取方式 要保证获取安全 需要 Double Check + 实例对象使用 volatile 修饰
 */
public class Singleton3 {

    private static volatile Singleton3 singleton3;

    private Singleton3(){}

    public static Singleton3 getSingleton3() {
        if (singleton3 == null) {
            synchronized (Singleton3.class) {
                if (singleton3 == null) {
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
    }
}
