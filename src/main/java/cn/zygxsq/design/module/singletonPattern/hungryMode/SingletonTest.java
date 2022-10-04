package cn.zygxsq.design.module.singletonPattern.hungryMode;

/**
 *
 * Created by yjl on 2022/8/4.
 */
public class SingletonTest {
    public static void main(String[] args) {
        //不合法的构造函数
        //编译时错误：构造函数 Singleton() 是不可见的
        //Singleton instance = new Singleton();

        //获取唯一可用的对象
        Singleton instance = Singleton.getInstance();

        //调用方法
        instance.dosomething();
    }
}
