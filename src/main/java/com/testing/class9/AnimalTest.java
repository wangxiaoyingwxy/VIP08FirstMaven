package com.testing.class9;

/**
 * @author : wangxy
 * @create time ： 2022/5/9
 * //只用方法才会被重写
 *
 */
public class AnimalTest {
    public static void main(String[] args) {
        //子类完成实例化操作的时候，会递归的调用父类的实例化构造方法
        //会先完成父类的构造方法，在执行子类的构造方法
        Cat happy=new Cat();
        System.out.println("happy的眼睛数是 "+happy.getEyes());
        happy.drink();
        happy.run();
        System.out.println("====================");
       /* System.out.println("动物的类型  "+happy.type);
        happy.play();
        //调用cat定义的新run方法
        happy.run(3);
        //调用继承类Animal的run方法
        happy.run();*/

        Rabbit bunny=new Rabbit();
        bunny.drink();
        System.out.println(bunny.type);
        System.out.println(bunny.getOriginType());
        bunny.run();



    }
}
