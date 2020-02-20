package org.copico.proxy.pattern.statics;

/**
 * @author owen
 */
public class Test {
    public static void main(String[] args) {
        Movie proxyMovie = new ProxyMovie(new RealMovie());
        proxyMovie.play();
        System.out.println();
        proxyMovie.times("随便");
    }
}
