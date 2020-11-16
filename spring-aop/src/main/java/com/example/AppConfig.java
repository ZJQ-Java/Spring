package com.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration //声明spring配置类
@ComponentScan(basePackages= {"com.example"})//扫包
@EnableAspectJAutoProxy(proxyTargetClass = true)//开启aop代理
public class AppConfig {
}
