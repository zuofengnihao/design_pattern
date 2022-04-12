package cn.zuofeng.p5;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/11 11:29
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        try {
            USBLine usbLine = new USBLine();
            usbLine.charge(new HomeBattery().supply());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("=========================================");
        try {
            USBLine usbLine = new USBLine();
            usbLine.charge(new Adapter().convert(new HomeBattery().supply()));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
