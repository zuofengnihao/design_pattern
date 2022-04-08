package cn.zuofeng.p4;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/8 14:35
 * @Description:
 */
public class Test2 {

    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car();
        car.setName("本田");
        car.setMaxSpeed(230);

        Car cloneCar = car.clone();

        System.out.println("source : " + car);
        System.out.println("clone : " + cloneCar);
        System.out.println("source == clone ? " + (car == cloneCar));
    }
}
