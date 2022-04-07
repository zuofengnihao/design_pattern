package cn.zuofeng.p1;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/7 14:30
 * @Description:
 */
public class Test1 {

    public static void main(String[] args) {
        Singleton1 one = Singleton1.getSingleton1();
        Singleton1 two = Singleton1.getSingleton1();
        System.out.println(one == two);
    }
}
