package com.demo02.java;

import java.util.ArrayList;
import java.util.Date;

public class HelloWord {
    //注释zhushi

    //region Description
    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    //endregion

    public int c;
    private static final int COUNT_NO = 0;

    public static void main(String[] args) {

        try {
            System.out.println("Hello Word!!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        ArrayList list = new ArrayList();

        Date date = new Date();

//        list.add(1,12);

        method1();

    }

    public static void method1() {

    }
}
