package cn.zuofeng.p11.static_proxy;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/12 15:48
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        // ๅๅ
        Person person = new PersonImpl();
        person.eat();
        person.sleep();
        System.out.println("==================================================");
        // ไปฃ็
        PersonProxy personProxy = new PersonProxy();
        personProxy.eat();
        personProxy.sleep();
    }
}
