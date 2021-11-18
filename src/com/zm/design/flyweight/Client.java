package com.zm.design.flyweight;

//使用享元模式-实现共享网站
public class Client {
    public static void main(String[] args) {
        System.out.println("享元模式-实现网站重用，节约内存空间，提高响应速度");
        //测试享元模式的内部状态
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite webSite = webSiteFactory.getWebSite("新闻");
//        webSite.use();

        WebSite webSite1 = webSiteFactory.getWebSite("新闻");
//        webSite1.use();

        WebSite webSite2 = webSiteFactory.getWebSite("微博");
//        webSite2.use();
        System.out.println("当前缓冲池的大小" + webSiteFactory.size());
        //测试外部状态，不共享，会发生改变

        WebSite webSite3 = webSiteFactory.getWebSite("微信");
        webSite3.use(new User("tom"));
    }
}
