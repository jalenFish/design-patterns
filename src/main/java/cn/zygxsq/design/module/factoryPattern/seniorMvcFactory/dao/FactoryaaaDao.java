package cn.zygxsq.design.module.factoryPattern.seniorMvcFactory.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by yjl on 2020/7/27.
 * 工厂模式之高级使用
 * 工厂模式介绍地址:https://blog.csdn.net/qq_27471405/article/details/107607047
 * 微信公众号：zygxsq
 */
@Mapper
@Component
public interface FactoryaaaDao {

   //数据访问层，该类里定义与mybatis中的sql的id里的同名的方法，来访问数据库
}
