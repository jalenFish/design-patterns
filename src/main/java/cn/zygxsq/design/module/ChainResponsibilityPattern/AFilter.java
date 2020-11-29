package cn.zygxsq.design.module.ChainResponsibilityPattern;

/**
 * Created by yjl on 2020/11/29.
 * 责任链模式：博文介绍链接：https://blog.csdn.net/qq_27471405/article/details/110340571
 */
public class AFilter implements Filter{
    private String name;
    private Filter filter;

    public AFilter() {
    }

    public AFilter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public void handler() {
        System.out.println("name="+name);
        if(getFilter()!=null){
            getFilter().handler();

        }

    }
}
