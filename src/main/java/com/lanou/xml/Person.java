package com.lanou.xml;


import java.util.*;

public class Person {

    private int a;
    private String b;
    private Dog c;
    private int[] d;
    private List e;
    private Set f;
    private Map g;
    private Properties h;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public Dog getC() {
        return c;
    }

    public void setC(Dog c) {
        this.c = c;
    }

    public int[] getD() {
        return d;
    }

    public void setD(int[] d) {
        this.d = d;
    }

    public List getE() {
        return e;
    }

    public void setE(List e) {
        this.e = e;
    }

    public Set getF() {
        return f;
    }

    public void setF(Set f) {
        this.f = f;
    }

    public Map getG() {
        return g;
    }

    public void setG(Map g) {
        this.g = g;
    }

    public Properties getH() {
        return h;
    }

    public void setH(Properties h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "Person{" +
                "a=" + a +
                ", b='" + b + '\'' +
                ", c=" + c +
                ", d=" + Arrays.toString(d) +
                ", e=" + e +
                ", f=" + f +
                ", g=" + g +
                ", h=" + h +
                '}';
    }
}
