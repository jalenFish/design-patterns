package cn.zygxsq.design.module.singletonPattern.enumMode;

/**
 * 单例模式，枚举方式
 * Created by yjl on 2022/8/5.
 */
public enum  SingletonEnum {
    INSTANCE;


    /* 要操作的一些方法*/
    public void dosomething(){
        System.out.println("单例模式方法调用");
    }
}
