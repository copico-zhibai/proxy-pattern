package org.copico.proxy.pattern.jdk;

import org.copico.proxy.pattern.statics.Movie;
import org.copico.proxy.pattern.statics.RealMovie;

import java.lang.reflect.Proxy;

/**
 * @author owen
 */
public class Test {
    public static void main(String[] args) {
        //真实对象
        Movie realMovie = new RealMovie();
        //代理对象
        ProxyMovieHandler proxyMovieHandler = new ProxyMovieHandler(realMovie);

        Movie movie = (Movie) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Movie.class}, proxyMovieHandler);
        movie.play();
        System.out.println();

        long times = movie.times("蜘蛛侠");
        System.out.println(times);

    }
}
