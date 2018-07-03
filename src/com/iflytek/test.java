package com.iflytek;

/**
 * Created by ghzhu3 on 2018/7/3.
 */
public class test {
    public static void main(String[] args) {
        System.out.println("version 2");
        System.out.println("version 12");
        System.out.println("version 3");
        System.out.println(add(1,3,4));
    }

    public static int add(int a, int b, int c){
        int result=0;
        result = a+b+c+2;
        return result;
    }
}
