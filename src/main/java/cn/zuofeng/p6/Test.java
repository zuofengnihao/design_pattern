package cn.zuofeng.p6;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/11 11:38
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Round round = new Round();
        rectangle.draw();
        round.draw();
        System.out.println("=================================");
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setColor(new Red());
        Round round1 = new Round();
        round1.setColor(new Blue());
        rectangle1.draw();
        round1.draw();
    }
}
