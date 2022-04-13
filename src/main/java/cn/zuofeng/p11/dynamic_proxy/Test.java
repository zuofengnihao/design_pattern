package cn.zuofeng.p11.dynamic_proxy;

import java.lang.reflect.Proxy;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/13 15:28
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        HelloHandler helloHandler = new HelloHandler(new HelloImpl());
        Object o = Proxy.newProxyInstance(IHello.class.getClassLoader(), new Class[]{IHello.class}, helloHandler);
        IHello hello = (IHello) o;
        hello.sayHello();
        System.out.println("======================================");
        hello.whoSay("zuofeng");
        System.out.println("======================================");
        String s = hello.sayWords(3);
        System.out.println(s);
    }
}
