package com.testing.class10;

/**
 * @author : wangxy
 * @create time ： 2022/5/10
 *
 * 抽象类不能被实例化
 * 继承抽象类的类可以实例化
 */
public class  AbExtends extends AbstractC {
    public void silent(){
        System.out.println("我是实现了抽象方法的子类宝宝");
    }
}
