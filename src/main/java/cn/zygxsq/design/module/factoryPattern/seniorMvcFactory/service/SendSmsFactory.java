package cn.zygxsq.design.module.factoryPattern.seniorMvcFactory.service;

import cn.zygxsq.design.config.ProjectName;
import org.springframework.stereotype.Component;

/**
 * Created by yjl on 2020/7/27.
 * 工厂模式之高级使用
 * 工厂模式介绍地址:https://blog.csdn.net/qq_27471405/article/details/107607047
 * 微信公众号：zygxsq
 */
//短信服务工厂实现类
@ProjectName(name = "sms")
@Component
public class SendSmsFactory implements Provider {
	public Sender produce() {
		return new SmsSender();
	}
}
