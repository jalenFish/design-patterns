package cn.zygxsq.design.module.ChainResponsibilityPattern;

/**
 * Created by yjl on 2020/11/29.
 * 责任链模式：博文介绍链接：https://blog.csdn.net/qq_27471405/article/details/110340571
 */
public class TestFilter {

    public static void main(String[] args) {
        AFilter a1= new AFilter("a1");
        AFilter b1 = new AFilter("b1");
        AFilter c1 = new AFilter("c1");


        a1.setFilter(b1);
        b1.setFilter(c1);

        a1.handler();
    }
}
