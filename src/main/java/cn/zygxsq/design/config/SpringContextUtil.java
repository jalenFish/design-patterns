package cn.zygxsq.design.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by yjl on 2020/7/27.
 */
@Component
public class SpringContextUtil implements ApplicationContextAware {
    private static Logger logger = LoggerFactory.getLogger(SpringContextUtil.class);

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (SpringContextUtil.applicationContext == null) {
            SpringContextUtil.applicationContext = applicationContext;
        }
        logger.info("初始化ApplicationContext：" + applicationContext);
    }

    /**
     * @return org.springframework.context.ApplicationContext
     * @description 获取applicationContext
     * @params []
     */
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    /**
     * @return java.lang.Object
     * @description 通过beanName获取Bean
     * @params [name]
     */
    public static Object getBean(String beanName) {
        return getApplicationContext().getBean(beanName);
    }

    /**
     * @return T
     * @description 通过class获取Bean
     * @params [clazz]
     */
    public static <T> T getBean(Class<T> clazz) {
        return getApplicationContext().getBean(clazz);
    }

    /**
     * @return T
     * @description 通过beanName和class返回指定的Bean
     * @params [name, clazz]
     */
    public static <T> T getBean(String name, Class<T> clazz) {
        return getApplicationContext().getBean(name, clazz);
    }

    /**
     * @return Map<String, T>
     * @description 获取指定类型的所有bean实例
     * @params [clazz]
     */
    public static <T> Map<String, T> getBeansByType(Class<T> clazz) {
        Map<String, T> instances = getApplicationContext().getBeansOfType(clazz);
        return instances;
    }

    /**
     * @return T
     * @description 根据名称获取bean实例
     * @params [clazz, markCode]
     */
    public static <T> T getBeanByProjectName(Class<T> clazz, String projectName) throws Exception{
        Map<String, T> instances = getBeansByType(clazz);
        if (instances.isEmpty()) {
            logger.info("未获取到类型[" + clazz + "]Bean列表!");
            return null;
        }
//        logger.info("获取类型[" + clazz + "]Bean列表：" + instances);
        for (String beanName : instances.keySet()) {
            T instance = instances.get(beanName);
            ProjectName project = instance.getClass().getAnnotation(ProjectName.class);

            if (project.name().equals(projectName)) {
                return instance;
            }
        }

        logger.info("所有的Bean列表["+instances.toString()+"]不存在您要找的ProjectName(name=\""+projectName+"\")注解");
        throw new Exception("所有的Bean列表["+instances.toString()+"]不存在您要找的ProjectName(name=\""+projectName+"\")注解");

        //return null;
    }

}
