package cn.zygxsq.design.module.singletonPattern.lazyMode.lazy6;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 反射获取私有构造函数，创建多个实例
 * Created by yjl on 2022/8/4.
 */
public class SingletonTestLazy6ReadResolve {
    public static void main(String[] args) throws Exception{

        SingletonTestLazy6ReadResolve singletonTestLazy6ReadResolve = new SingletonTestLazy6ReadResolve();
        singletonTestLazy6ReadResolve.copy();
    }

    public SingletonLazy6 copy() throws Exception{
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(SingletonLazy6.getInstance());

        InputStream is = new ByteArrayInputStream(os.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(is);
        SingletonLazy6 obj = (SingletonLazy6) ois.readObject();
        return obj;
    }
}
