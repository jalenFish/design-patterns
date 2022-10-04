package cn.zygxsq.design.module.singletonPattern.lazyMode.lazy3;

/**
 * 懒汉模式3，线程安全，双重校验（不常用）
 * Created by yjl on 2022/8/4.
 */
public class SingletonLazy3 {
    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static SingletonLazy3 instance = null;

    /* 私有构造方法，防止被实例化 */
    private SingletonLazy3() {
    }

    /*  synchronized加锁，保证单例 */
    public static SingletonLazy3 getInstance() {
        if (instance == null) {
            synchronized (SingletonLazy3.class) {
                if (instance == null) {
                    instance = new SingletonLazy3();
                }
            }
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
