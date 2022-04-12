package cn.zuofeng.p11.static_proxy;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/12 15:49
 * @Description:
 */
public class PersonProxy implements Person {

    private final PersonImpl person = new PersonImpl();

    @Override
    public void eat() {
        System.out.println("吃饭前洗手...");
        person.eat();
        System.out.println("吃饭后洗碗...");
    }

    @Override
    public void sleep() {
        System.out.println("睡觉前刷牙...");
        person.sleep();
        System.out.println("醒来后刷牙...");
    }
}
