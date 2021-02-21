package dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author ZHQ
 * @date 2021/2/17
 */
public class WorkHandler implements InvocationHandler {

    private Object object;

    public WorkHandler(Object object) {
        this.object = object;
    }

    public WorkHandler() {
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before invoke");
        Object invoke = method.invoke(object, args);
        System.out.println("after invoke");
        return invoke;
    }
}
