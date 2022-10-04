package cn.zygxsq.design.module.singletonPattern.lazyMode.lazy1;

/**
 * 懒汉模式1，线程不安全
 * Created by yjl on 2022/8/4.
 */
public class SingletonLazy1 {
    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static SingletonLazy1 instance = null;

    /* 私有构造方法，防止被实例化 */
    private SingletonLazy1() {
    }

    /* 静态工程方法，创建实例 */
    public static SingletonLazy1 getInstance() {
        if (instance == null) {
            instance = new SingletonLazy1();
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
