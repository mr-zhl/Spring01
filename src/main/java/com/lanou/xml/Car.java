package com.lanou.xml;


//饿汉模式
public class Car {
//    private final static Car ourInstance = new Car();
//
//    //返回对象
//    public static Car getInstance() {
//        return ourInstance;
//    }
//
//
//    //不允许外部创建对象
//    private Car() {
//    }

    private static Car ourInsttance = null;

    private Car() {

    }

    //方法
    //synchronized:线程安全,保证多线程下的安全性,统一时间只能有一个线程调用该方法
    public synchronized static Car getInstance() {
        if (ourInsttance == null) {
            ourInsttance = new Car();
        }
        return ourInsttance;
    }


}
