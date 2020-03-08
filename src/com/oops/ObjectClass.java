package com.oops;

import java.util.Date;

public class ObjectClass {
 
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());
        Date date2 = (Date) date.clone();
        System.out.println(date2.toString());
    }
}