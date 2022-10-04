package cn.zygxsq.design.module.singletonPattern.lazyMode.lazy4;

/**
 * 懒汉模式4，线程安全，双重校验，volatile可见性，实现较为复杂
 * Created by yjl on 2022/8/4.
 */
public class SingletonLazy4 {
    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private volatile static SingletonLazy4 instance = null;

    /* 私有构造方法，防止被实例化 */
    private SingletonLazy4() {
    }

    /*  synchronized加锁，保证单例 */
    public static SingletonLazy4 getInstance() {
        if (instance == null) {
            synchronized (SingletonLazy4.class) {
                if (instance == null) {
                    instance = new SingletonLazy4();
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
