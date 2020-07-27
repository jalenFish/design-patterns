package cn.zygxsq.design.module.factoryPattern.abstractFactory;

/**
 * Created by yjl on 2020/7/27.
 * 工厂模式之抽象工厂模式
 * 工厂模式介绍地址:https://blog.csdn.net/qq_27471405/article/details/107607047
 * 微信公众号：zygxsq
 */
//短信服务工厂实现类
public class SendSmsFactory implements Provider {
	public Sender produce() {
		return new SmsSender();
	}
}
