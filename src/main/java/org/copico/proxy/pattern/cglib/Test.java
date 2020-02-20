package org.copico.proxy.pattern.cglib;

/**
 * @author owen
 */
public class Test {
    public static void main(String[] args) {
        // 生成 Cglib 代理类
        Coder coderProxy = (Coder) CglibProxy.getProxy(Coder.class);
        // 调用相关方法
        coderProxy.eat();
        coderProxy.play();
    }
}
