package cn.zygxsq.design.module.singletonPattern.lazyMode.lazy6.testReadResolve;

import cn.zygxsq.design.module.singletonPattern.lazyMode.lazy6.SingletonLazy6;

import java.io.*;

/**
 * 反射获取私有构造函数，创建多个实例
 * Created by yjl on 2022/8/4.
 */
public class SingletonTestLazy6ReadResolve {
    public static void main(String[] args) throws Exception{

        // 将SingletonLazy6Serializable类的readResolve()方法注释执行一下和不注释执行一下
        // 查看打印结果
        SingletonTestLazy6ReadResolve singletonTestLazy6ReadResolve = new SingletonTestLazy6ReadResolve();
        singletonTestLazy6ReadResolve.copy();
    }

    //测试方式,把单例对象序列化后再反序列化从而获得一个新的对象 就相当于复制了一个单例对象
    public SingletonLazy6Serializable copy() throws Exception{
        System.out.println(SingletonLazy6Serializable.getInstance());
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(SingletonLazy6Serializable.getInstance());

        InputStream is = new ByteArrayInputStream(os.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(is);
        SingletonLazy6Serializable obj = (SingletonLazy6Serializable) ois.readObject();
        System.out.println(obj);
        return obj;
    }
}
