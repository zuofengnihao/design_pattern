package cn.zuofeng.p1;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/7 14:38
 * @Description:
 */
public class Test2 {

    public static void main(String[] args) {
        Singleton2 one = Singleton2.getSingleton2();
        Singleton2 two = Singleton2.getSingleton2();
        System.out.println(one == two);
    }
}
