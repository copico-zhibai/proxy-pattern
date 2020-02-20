package org.copico.proxy.pattern.statics;

import lombok.AllArgsConstructor;

/**
 * @author owen
 */
@AllArgsConstructor
public class ProxyMovie implements Movie {

    private Movie movie;

    @Override
    public void play() {
        System.out.println("找资源\n下载");
        movie.play();
        System.out.println("关电脑");
    }

    @Override
    public long times(String name) {
        System.out.println("看完才知道");
        return movie.times(name);
    }
}
