package cn.zygxsq.design.module.singletonPattern.lazyMode.lazy5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 反射获取私有构造函数，创建多个实例
 * Created by yjl on 2022/8/4.
 */
public class SingletonTestLazy5Reflection {
    public static void main(String[] args) throws Exception{

        // 1：通过Class的静态方法forName加载
        Class aClass = Class.forName("cn.zygxsq.design.module.singletonPattern.lazyMode.lazy5.SingletonLazy5");

        //获取私有构造方法
        //Constructor con = c.getConstructor(String.class);
        //NoSuchMethodException没有这个方法异常
        //原因是一开始我们使用的方法只能获取公共的，下面这种方式就可以
        Constructor con = aClass.getDeclaredConstructor();

        //用该私有方法创建对象
        //IllegalAccessException:非法访问异常
        //暴力访问
        con.setAccessible(true);//值为true则指示反射的对象在使用是应该取消Java语言访问检查

        // 实例化对象的方法
        Object o1 = con.newInstance();
        System.out.println(o1);
        //Method m = o1.getClass().getDeclaredMethod("dosomething", null);

        //访问方法
        Method m = aClass.getDeclaredMethod("dosomething", null);

       //调用方法
        m.invoke(o1, null);

        // 第二次创建对象
        Class aClass2 = Class.forName("cn.zygxsq.design.module.singletonPattern.lazyMode.lazy5.SingletonLazy5");
        Constructor con2 = aClass2.getDeclaredConstructor();

        //用该私有方法创建对象
        //IllegalAccessException:非法访问异常
        //暴力访问
        con2.setAccessible(true);//值为true则指示反射的对象在使用是应该取消Java语言访问检查

        // 实例化对象的方法
        Object o2 = con2.newInstance();
        System.out.println(o2);
    }
}
