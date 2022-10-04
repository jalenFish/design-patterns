package cn.zygxsq.design.module.singletonPattern.lazyMode.lazy5;

/**
 * 懒汉模式5，线程安全，静态内部类
 * Created by yjl on 2022/8/4.
 */
public class SingletonLazy5 {
    /* 私有构造方法，防止被实例化 */
    private SingletonLazy5() {
    }

    /* 此处使用一个内部类来维护单例 */
    private static class SingletonFactory {
        private static SingletonLazy5 instance = new SingletonLazy5();
    }

    /* 获取实例 */
    public static SingletonLazy5 getInstance() {
        return SingletonFactory.instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    private Object readResolve() {
        return getInstance();
    }

    /* 要操作的一些方法*/
    public void dosomething(){
        System.out.println("单例模式方法调用");
    }
}
