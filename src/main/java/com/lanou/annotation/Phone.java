package com.lanou.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;


@Component
public class Phone {
    @Value("1")
    private int a;


    //Resource和Autowired区别:
    //1.先找类型,后找id,包搜索;Resource,java提供的注解,先找id名字.后找类型
    //先找类型,再找id,(required=false)
    //只有一个类型.可以匹配
//    @Autowired
//    @Qualifier("computer")
    //指定id找的是谁
    @Resource
    private Computer computer;

    @Override
    public String toString() {
        return "Phone{" +
                "a=" + a +
                ", computer=" + computer +
                '}';

    }

    //初始化执行
    @PostConstruct
    public void init(){
        System.out.println("init");
    }
    //销毁执行
    @PreDestroy
    public void destroy(){
        System.out.println("destroy");
    }
}
