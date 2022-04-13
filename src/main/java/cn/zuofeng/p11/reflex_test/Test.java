package cn.zuofeng.p11.reflex_test;

import java.lang.reflect.InvocationTargetException;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/13 15:40
 * @Description:
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //获取class对象的三种方式
        Class cowClass1 = Cow.class;
        Cow cow = new Cow();
        Class cowClass2 = cow.getClass();
        Class cowClass3 = Class.forName("cn.zuofeng.p11.reflex_test.Cow");

        System.out.println(cowClass1 == cowClass2);
        System.out.println(cowClass1 == cowClass3);
        System.out.println(cowClass3 == cowClass2);

    }
}
