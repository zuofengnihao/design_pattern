package cn.zuofeng.p11.reflex_test;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/13 15:41
 * @Description:
 */
public class Cow implements Animal {
    @Override
    public String hunt() {
        return "草";
    }

    @Override
    public void eat(String food) {
        System.out.println("正在吃 " + food);
    }
}
