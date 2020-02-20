package org.copico.proxy.pattern.statics;

/**
 * @author owen
 */
public class RealMovie implements Movie {
    @Override
    public void play() {
        System.out.println("点击播放");
    }

    @Override
    public long times(String name) {
        System.out.println(name);
        return 200;
    }
}
