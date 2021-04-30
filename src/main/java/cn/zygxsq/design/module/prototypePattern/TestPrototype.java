package cn.zygxsq.design.module.prototypePattern;

import com.alibaba.fastjson.JSON;

import javax.xml.bind.annotation.DomHandler;

/**
 * Created by yjl on 2021/4/30.
 * 测试主类 浅复制
 * 原型模式：博文介绍链接：https://blog.csdn.net/qq_27471405/article/details/116309878
 */
public class TestPrototype {
    public static void main(String[] args) {
        DataCache.init(); // 模拟加载数据到缓存中

        try {
            Animal animal = DataCache.getAnimal("111");
            System.out.println(animal.getName()+"---"+JSON.toJSONString(animal));

            Animal animal222 = DataCache.getAnimal("222");
            System.out.println(animal222.getName()+"---"+JSON.toJSONString(animal222));

            Animal animal333 = DataCache.getAnimal("333");
            System.out.println(animal333.getName()+"---"+JSON.toJSONString(animal333));

            animal.shout();
            animal222.shout();
            animal333.shout();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
