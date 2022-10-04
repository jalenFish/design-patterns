package cn.zygxsq.design.module.singletonPattern.hungryMode;

/**
 * 饿汉模式 线程安全
 * Created by yjl on 2022/8/4.
 */
public class Singleton {
    /* 持有私有静态实例，防止被引用*/
    private static Singleton instance = new Singleton();

    /* 私有构造方法，防止被实例化 */
    private Singleton() {
    }

    /* 静态工程方法，返回Singleton实例 */
    public static Singleton getInstance() {
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
