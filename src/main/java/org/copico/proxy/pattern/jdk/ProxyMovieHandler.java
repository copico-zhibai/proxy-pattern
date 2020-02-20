package org.copico.proxy.pattern.jdk;

import lombok.AllArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author owen
 */
@AllArgsConstructor
public class ProxyMovieHandler implements InvocationHandler {

    private Object target;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("找资源\n下载");
        Object object = method.invoke(target, args);
        System.out.println("关机");
        return object;
    }
}
