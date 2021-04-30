package cn.zygxsq.design.module.prototypePattern;

/**
 * Created by yjl on 2021/4/30.
 */
public class Dog extends Animal {
    public Dog(){
        name = "狗狗";
    }

    @Override
    public void shout() {
        System.out.println("我的叫声是：汪汪汪");
    }
}
