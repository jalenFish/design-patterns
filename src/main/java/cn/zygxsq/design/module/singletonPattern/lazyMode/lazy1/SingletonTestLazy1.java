package cn.zygxsq.design.module.singletonPattern.lazyMode.lazy1;

import cn.zygxsq.design.module.singletonPattern.hungryMode.Singleton;

/**
 *
 * Created by yjl on 2022/8/4.
 */
public class SingletonTestLazy1 {
    public static void main(String[] args) {
        //不合法的构造函数
        //编译时错误：构造函数 SingletonLazy1() 是不可见的
        //SingletonLazy1 instance = new SingletonLazy1();

        //获取唯一可用的对象
        SingletonLazy1 instance = SingletonLazy1.getInstance();

        //调用方法
        instance.dosomething();
    }
}
