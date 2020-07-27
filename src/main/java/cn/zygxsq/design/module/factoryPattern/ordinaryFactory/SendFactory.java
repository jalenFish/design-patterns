package cn.zygxsq.design.module.factoryPattern.ordinaryFactory;

/**
 * Created by yjl on 2020/7/27.
 * 工厂模式之普通工厂模式
 * 工厂模式介绍地址:https://blog.csdn.net/qq_27471405/article/details/107607047
 * 微信公众号：zygxsq
 */
//创建工厂类
public class SendFactory {
	//工厂方法
	public Sender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} else {
			System.out.println("请输入正确的类型!");
			return null;
		}
	}
}
