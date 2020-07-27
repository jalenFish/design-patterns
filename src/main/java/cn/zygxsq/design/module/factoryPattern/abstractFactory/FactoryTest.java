package cn.zygxsq.design.module.factoryPattern.abstractFactory;

import cn.zygxsq.design.module.factoryPattern.staticFactory.SendFactory;

/**
 * Created by yjl on 2020/7/27.
 * 工厂模式之抽象工厂模式
 * 工厂模式介绍地址:https://blog.csdn.net/qq_27471405/article/details/107607047
 * 微信公众号：zygxsq
 */
//测试类
public class FactoryTest {
	public static void main(String[] args) {
		Provider provider = new SendMailFactory();
		Sender sender = provider.produce();
		sender.Send();
	}
}