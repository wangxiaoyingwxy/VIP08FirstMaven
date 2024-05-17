package com.testing.class9;

/**
 * @author : wangxy
 * @create time ： 2022/5/9
 * object 是所有java类的父类，祖宗类
 */
public class Thing {
    public Thing(){
        System.out.println("这是一个东西");
    }
    public Thing(String describe){
        System.out.println("这是一个"+ describe+"东西");
    }
}
