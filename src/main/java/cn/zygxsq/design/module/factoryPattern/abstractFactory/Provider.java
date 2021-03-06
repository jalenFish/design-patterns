package cn.zygxsq.design.module.factoryPattern.abstractFactory;

/**
 * Created by yjl on 2020/7/27.
 * 工厂模式之抽象工厂模式
 * 工厂模式介绍地址:https://blog.csdn.net/qq_27471405/article/details/107607047
 * 微信公众号：zygxsq
 */
//给工厂类一个接口
public interface Provider {
	public Sender produce();
}
