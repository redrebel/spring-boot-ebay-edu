package com.ebaykorea.spring.boot.jboard;

public class MyUtil {
    private Calc calc;

    public MyUtil() {
        System.out.println("MyUtil()");
    }

    public MyUtil(Calc calc){
        this.calc = calc;
        System.out.println("MyUtil(calc)");
    }
}
