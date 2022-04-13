package cn.zuofeng.p11.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/13 15:26
 * @Description:
 */
public class HelloHandler implements InvocationHandler {

    private Object target;

    public HelloHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String  className = proxy.getClass().getName();
        System.out.println("Class Name : " + className);
        String methodName = method.getName();
        System.out.println("Method Name : " + methodName);
        switch (methodName) {
            case "sayHello" :
                System.out.println("nobody say");
                method.invoke(target, args);
                return null;
            case "whoSay" :
                System.out.println("someone say");
                method.invoke(target, args);
                return null;
            case "sayWords":
                System.out.println("the words");
                return method.invoke(target, args);
            default:
                System.out.println(methodName + " is not function !");
                return null;
        }
    }
}
