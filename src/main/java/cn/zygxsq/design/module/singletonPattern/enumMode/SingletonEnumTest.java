package cn.zygxsq.design.module.singletonPattern.enumMode;

/**
 * Created by yjl on 2022/8/5.
 */
public class SingletonEnumTest {
    public static void main(String[] args) {
        SingletonEnum instance = SingletonEnum.INSTANCE;
        instance.dosomething();
    }
}
