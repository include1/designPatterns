package com.zm.design.flyweight;

import java.util.HashMap;

public class WebSiteFactory {
    //创建一个缓冲池
    private HashMap<String, WebSite> pool = new HashMap<>();

    public WebSiteFactory() {
    }

    public WebSite getWebSite(String type) {
        WebSite webSite = null;
        if (null != type && !" ".equals(type)) {
            if (!pool.containsKey(type)) {
                webSite = new ConcreteWebSite(type);
                pool.put(type, webSite);
            } else {
                webSite = pool.get(type);
            }
        }
        return webSite;

    }

    public int size(){
        return pool.size();
    }
}
