package cn.zygxsq.design.module.singletonPattern.lazyMode.lazy3;

/**
 *
 * Created by yjl on 2022/8/4.
 */
public class SingletonTestLazy3 {
    public static void main(String[] args) {
        //获取唯一可用的对象
        SingletonLazy3 instance = SingletonLazy3.getInstance();

        //调用方法
        instance.dosomething();
    }
}
