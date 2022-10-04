package cn.zygxsq.design.module.singletonPattern.lazyMode.lazy5;

/**
 *
 * Created by yjl on 2022/8/4.
 */
public class SingletonTestLazy5 {
    public static void main(String[] args) {

        //获取唯一可用的对象
        SingletonLazy5 instance = SingletonLazy5.getInstance();

        //调用方法
        instance.dosomething();
    }
}
