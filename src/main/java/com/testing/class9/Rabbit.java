package com.testing.class9;

/**
 * @author : wangxy
 * @create time ： 2022/5/9
 */
public class Rabbit extends Animal{
    public String type="兔子";
    public void drink(){
        System.out.println("兔子喝水突突突 ");
    }
    //获取父类的属性
    public String getOriginType(){
        return super.type;
    }
}
