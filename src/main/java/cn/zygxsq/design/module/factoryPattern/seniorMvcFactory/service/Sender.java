package cn.zygxsq.design.module.factoryPattern.seniorMvcFactory.service;

/**
 * Created by yjl on 2020/7/27.
 * 工厂模式之高级使用
 * 工厂模式介绍地址:https://blog.csdn.net/qq_27471405/article/details/107607047
 * 微信公众号：zygxsq
 */
//发送短信和邮件的接口
public interface Sender {
	public void Send();
}
