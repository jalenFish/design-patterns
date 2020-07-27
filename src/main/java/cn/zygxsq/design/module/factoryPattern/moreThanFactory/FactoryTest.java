package cn.zygxsq.design.module.factoryPattern.moreThanFactory;

/**
 * Created by yjl on 2020/7/27.
 * 工厂模式之多个工厂方法模式
 * 工厂模式介绍地址:https://blog.csdn.net/qq_27471405/article/details/107607047
 * 微信公众号：zygxsq
 */
//测试类
public class FactoryTest {
	public static void main(String[] args) {
		SendFactory factory = new SendFactory();
		Sender sender = factory.produceMail();
		sender.Send();
	}
}