package com.lanou;

import com.lanou.xml.Boy;
import com.lanou.xml.Car;
import com.lanou.xml.Dog;
import com.lanou.xml.Girl;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    void test1() {
        //由程序员管理对象
        Girl girl=new Girl();
        System.out.println(girl);
    }

    @Test
    void test2() {
        //xml配置Spring容器


        //通过xml初始化容器
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(context);


        //从容器中获取对象
        Girl girl = (Girl)context.getBean("girl");
        System.out.println(girl);

        //练习:新建一个boy和Dog类,通过容器获取对象
        Boy boy = (Boy)context.getBean("boy");
        Dog dog = (Dog) context.getBean("dog");
        System.out.println(boy);
        System.out.println(dog);
        Object girl2 = context.getBean("girl2");
        System.out.println(girl2);

        Object girl3 = context.getBean("girl3");
        System.out.println(girl3);

        Object girl4 = context.getBean("girl4");
        System.out.println(girl4);

        Object person = context.getBean("person");
        System.out.println(person);

    }

    @Test
    void test3() {
        //
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");


        Object cat = context.getBean("cat");
        System.out.println(cat);
        Object cat1 = context.getBean("cat");
        System.out.println(cat1);

        Car car=Car.getInstance();
        Object cat2 = context.getBean("cat1");
        System.out.println(cat2);
        Object cat3 = context.getBean("cat1");
        System.out.println(cat3);


        Object cat4 = context.getBean("cat2");
        System.out.println(cat4);
        Object cat5 = context.getBean("cat2");
        System.out.println(cat5);

        context.close();

    }

    @Test
    void test4() {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext1.xml");

        Object phone = context.getBean("phone");
        System.out.println(phone);

        Object computer = context.getBean("computer");

    }
}
