package cn.zygxsq.design.module.prototypePattern;

/**
 * Created by yjl on 2021/4/30.
 */
public class Cat extends Animal {
    public Cat(){
        name = "猫猫";
    }

    @Override
    public void shout() {
        System.out.println("我的叫声是：喵喵喵");
    }
}
