package cn.zuofeng.p6;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/11 11:37
 * @Description:
 */
public class Round implements Shape {

    private Color color;

    @Override
    public void draw() {
        if (color != null && color.getColor() != null && color.getColor() != "") {
            System.out.println("画" + color.getColor() + "的方");
        } else {
            System.out.println("画圆");
        }

    }

    public void setColor(Color color) {
        this.color = color;
    }
}
