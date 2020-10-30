package com.fablen;

import java.util.Date;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhangbaosheng
 * @version v1.0.0
 * @date 2020-10-30 14:27
 * @see
 */
public class LocalVariablesDemo {

    public static void main(String[] args) {
        LocalVariablesDemo localVariablesDemo = new LocalVariablesDemo();
        int num=10;
        localVariablesDemo.test1();

    }

    public void test1() {
        Date date = new Date();
        String name = "fablen.com";
        test2(date, name);
        System.out.println(date + name);
    }

    public String test2(Date date, String name) {
        date = null;
        name = "djaohklgds";
        double weitht = 132.4; //double占据2个slot
        char gender = '男';

        double hight = 293.98;
        int a = 10;

        return date + name;
    }
}
