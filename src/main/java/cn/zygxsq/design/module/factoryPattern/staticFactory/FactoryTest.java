package cn.zygxsq.design.module.factoryPattern.staticFactory;

/**
 * Created by yjl on 2020/7/27.
 * 工厂模式之静态工厂方法模式
 * 工厂模式介绍地址:https://blog.csdn.net/qq_27471405/article/details/107607047
 * 微信公众号：zygxsq
 */
//测试类
public class FactoryTest {
	public static void main(String[] args) {
		Sender sender = SendFactory.produceMail();
		sender.Send();
	}
}