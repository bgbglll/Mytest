package com.bg.test;

/**
 * Created by Administrator on 2016/6/25.
 */
public class Test {
    public static void  print(int i, String str) {
        System.out.println("{" + i + "}" + "," + str);
    }

    public static void main(String[] args) {
        print(1,"Hello, World!");
        print(12,"Hello, World!");
        print(12,"Hello, World!");
        print(12,"Hello, World!");
    }
}
