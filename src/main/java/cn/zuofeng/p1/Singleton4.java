package cn.zuofeng.p1;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/7 15:55
 * @Description:
 * 最后一种懒汉模式 静态内部类创建对象
 *
 *
 */
public class Singleton4 {

    static {
        System.out.println("Singleton4 加载");
    }

    private static class SingletonHolder {

        static {
            System.out.println("内部类 SingletonHolder 加载");
        }

        public static Singleton4 singleton4 = new Singleton4();
    }

    private Singleton4(){}

    public static Singleton4 getSingleton4() {
        return SingletonHolder.singleton4;
    }
}
