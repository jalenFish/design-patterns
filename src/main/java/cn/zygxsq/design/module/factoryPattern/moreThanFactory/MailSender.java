package cn.zygxsq.design.module.factoryPattern.moreThanFactory;

/**
 * Created by yjl on 2020/7/27.
 * 工厂模式之多个工厂方法模式
 * 工厂模式介绍地址:https://blog.csdn.net/qq_27471405/article/details/107607047
 * 微信公众号：zygxsq
 */
//发送邮件的实现类
public class MailSender implements Sender {
	public void Send() {
		//这里写发送邮件的业务逻辑
		System.out.println("发送邮件!");
	}
}
