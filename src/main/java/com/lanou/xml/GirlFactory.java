package com.lanou.xml;

public class GirlFactory {

    public Girl createGirl(){
        return new Girl();
    }

    public static Girl makeGirl(){
        return new Girl();
    }
}
