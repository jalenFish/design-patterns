package cn.zygxsq.design.module.factoryPattern.seniorMvcFactory.web;

import cn.zygxsq.design.config.SpringContextUtil;
import cn.zygxsq.design.module.factoryPattern.seniorMvcFactory.service.Provider;
import cn.zygxsq.design.module.factoryPattern.seniorMvcFactory.service.SendMailFactory;
import cn.zygxsq.design.module.factoryPattern.seniorMvcFactory.service.SendSmsFactory;
import cn.zygxsq.design.module.factoryPattern.seniorMvcFactory.service.Sender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yjl on 2020/7/27.
 * 工厂模式之高级使用
 * 工厂模式介绍地址:https://blog.csdn.net/qq_27471405/article/details/107607047
 * 微信公众号：zygxsq
 */
@RestController
@RequestMapping(value = "bbb",method = RequestMethod.GET)
public class FactorybbbController {


	@ResponseBody
	@RequestMapping("/getFactorybbb")
	public void getbbb(String projectName,String aaa,String bbb){
		//通过前端传递指定projectName来判断
		try {
			if (projectName==null){
				projectName="sms";
			}
			Provider provider = SpringContextUtil.getBeanByProjectName(Provider.class, projectName);
			Sender produce = provider.produce();
			produce.Send();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}



}

