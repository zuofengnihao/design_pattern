package cn.zuofeng.p5;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/11 11:17
 * @Description:
 */
public class USBLine {

    void charge(int volt) throws IllegalAccessException {
        if (volt != 5) throw new IllegalAccessException("只能接收 5V 电压");
        System.out.println("正常冲电...");
    }
}
