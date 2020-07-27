package cn.zygxsq.design.module.factoryPattern.ordinaryFactory;

/**
 * Created by yjl on 2020/7/27.
 * 工厂模式之普通工厂模式
 * 工厂模式介绍地址:https://blog.csdn.net/qq_27471405/article/details/107607047
 * 微信公众号：zygxsq
 */
//发送短信的实现类
public class SmsSender implements Sender {
	public void Send() {
		//这里写发送短信的业务逻辑
		System.out.println("发送短信!");
	}
}
