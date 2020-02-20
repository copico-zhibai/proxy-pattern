package org.copico.proxy.pattern.cglib;

import lombok.AllArgsConstructor;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Cglib 动态代理是针对代理的类, 动态生成一个子类, 然后子类覆盖代理类中的方法, 如果是private或是final类修饰的方法,则不会被重写。
 * CGLIB是一个功能强大，高性能的代码生成包。它为没有实现接口的类提供代理，为JDK的动态代理提供了很好的补充。通常可以使用Java的动态代理创建代理，但当要代理的类没有实现接口或者为了更好的性能，CGLIB是一个好的选择。
 *
 * @author owen
 */
public class CglibProxy implements MethodInterceptor {


    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("开始前");
        proxy.invokeSuper(obj, args);
        System.out.println("结束后");
        return null;
    }

    public static Object getProxy(Class clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(new CglibProxy());
        return enhancer.create();
    }
}
