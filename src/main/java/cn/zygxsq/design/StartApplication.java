package cn.zygxsq.design;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})//表示不连数据库，如果要连数据库，将该注解去掉
@EnableAsync
@EnableScheduling
@SpringBootApplication
public class StartApplication{


    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}

