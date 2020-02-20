package org.copico.proxy.pattern.cglib;

/**
 * Cglib 动态代理是针对代理的类, 动态生成一个子类, 然后子类覆盖代理类中的方法, 如果是private或是final类修饰的方法,则不会被重写。
 * CGLIB是一个功能强大，高性能的代码生成包。它为没有实现接口的类提供代理，为JDK的动态代理提供了很好的补充。通常可以使用Java的动态代理创建代理，但当要代理的类没有实现接口或者为了更好的性能，CGLIB是一个好的选择。
 *
 * @author owen
 */
public class Coder {

    public void eat() {
        System.out.println("程序员吃饭");
    }

    private void work() {
        System.out.println("程序员工作");
    }

    public final void play() {
        System.out.println("程序员在完游戏");
    }

}
