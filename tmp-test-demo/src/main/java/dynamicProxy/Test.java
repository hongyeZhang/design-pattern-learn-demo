package dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author ZHQ
 * @date 2021/2/17
 */
public class Test {

    public static void main(String[] args) {
        People people = new Teacher();
        InvocationHandler handler = new WorkHandler(people);
        People proxy = (People) Proxy.newProxyInstance(handler.getClass().getClassLoader(), people.getClass().getInterfaces(), handler);
        System.out.println(proxy.work());
    }
}
