package com.testing.class10;

/**
 * @author : wangxy
 * @create time ： 2022/5/10
 * 抽象类中，可以具有方法体的已经实现的方法，也可以有由abstract 修饰的抽象方法
 * 抽象类中，可以有抽象方法，没有方法体，也可以有非抽象方法，具有方法体的方法
 *
 *
 */
public abstract class  AbstractC {
    String kind="抽象";
     String like="";
    public void sound(){
        System.out.println("我是抽象类中的具体实现方法");
    }
    //抽象方法不允许有方法体
    public abstract void silent();

}
