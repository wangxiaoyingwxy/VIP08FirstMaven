package com.testing.class9;

/**
 * @author : wangxy
 * @create time ： 2022/5/11
 */
public class tiger extends Animal{
    String mouth="这是嘴";
    public void drink(){
        System.out.println("这是重写的喝水");
    }
    public void odrink(){
        super.drink();
    }

    public static void main(String[] args) {
        tiger t=new tiger();
        t.drink();
        t.odrink();
    }
}
