package cn.zygxsq.design.module.prototypePattern;

import com.alibaba.fastjson.JSON;

/**
 * Created by yjl on 2021/4/30.
 * 测试主类 深复制
 * 原型模式：博文介绍链接：https://blog.csdn.net/qq_27471405/article/details/116309878
 */
public class TestPrototypeDeepClone {
    public static void main(String[] args) {
        DataCache.init(); // 模拟加载数据到缓存中

        try {
            Animal a1 = DataCache.getAnimal("111");
            Animal a2 = (Animal)a1.deepClone();
            System.out.println(a1==a2);
            System.out.println(a1.name == a2.name);
            System.out.println(a1.name);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
