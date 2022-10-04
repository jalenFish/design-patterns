package cn.zygxsq.design.module.singletonPattern.lazyMode.lazy2;

/**
 * 懒汉模式2，线程安全（不常用）
 * Created by yjl on 2022/8/4.
 */
public class SingletonLazy2 {
    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static SingletonLazy2 instance = null;

    /* 私有构造方法，防止被实例化 */
    private SingletonLazy2() {
    }

    /*  synchronized加锁，保证单例 */
    public static synchronized SingletonLazy2 getInstance() {
        if (instance == null) {
            instance = new SingletonLazy2();
        }
        return instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    private Object readResolve() {
        return instance;
    }

    /* 要操作的一些方法*/
    public void dosomething(){
        System.out.println("单例模式方法调用");
    }
}
