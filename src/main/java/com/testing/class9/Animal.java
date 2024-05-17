package com.testing.class9;

/**
 * @author : wangxy
 * @create time ： 2022/5/9
 * java 中没有多继承，不能同时继承多个类，但是可以多重的继承
 *
 */
public class Animal extends Thing {
    //变量
    public int eyes=2;
    public int nose=1;
    public String type="动物";

    //方法
    public int getEyes(){
        return eyes;
    }

    //方法
    public Animal(){
        super("会动啊");
        System.out.println("动物出生了");
    }

    public  void drink(){
        System.out.println("动物都会喝水");
    }
    public void run(){
        System.out.println("动物都能动");
    }






}
