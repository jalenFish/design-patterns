package cn.zygxsq.design.module.prototypePattern;

import com.alibaba.fastjson.JSON;

/**
 * Created by yjl on 2021/4/30.
 * 浅复制遇到的问题 博文介绍链接：https://blog.csdn.net/qq_27471405/article/details/116309878
 */
public class TestCloneProblem {

    public static void main(String[] args) {
        //做完TestPrototype的main方法后，好像觉得浅复制没有什么问题
        //那么可以看一下下面的a1的name 和 克隆后的name指向的是同一个地址
        DataCache.init(); // 模拟加载数据到缓存中

        try {
            Animal a1 = DataCache.getAnimal("111");
            Animal a2 = (Animal)a1.clone();
            System.out.println(a1==a2);
            System.out.println(a1.name == a2.name); //false
            System.out.println(a1.name); //true
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
