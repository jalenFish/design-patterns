package cn.zygxsq.design.module.singletonPattern.lazyMode.lazy6;


/**
 *
 * Created by yjl on 2022/8/4.
 */
public class SingletonTestLazy6 {
    public static void main(String[] args) {

        //获取唯一可用的对象
        SingletonLazy6 instance = SingletonLazy6.getInstance();

        //调用方法
        instance.dosomething();

        SingletonLazy6 instance2 = SingletonLazy6.getInstance();

        //调用方法
        instance2.dosomething();
    }
}
