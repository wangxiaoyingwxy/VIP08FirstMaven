package com.testing.class9;

/**
 * @author : wangxy
 * @create time ： 2022/5/9
 * //子类可以继承父类的方法和属性
 * 子类可以扩展父类的变量和方法
 * 重写  override  ：条件是子类和父类的方法的方法名、返回类型、参数列表都一样
 *      子类中定义和父类中以下3项都一样的方法
 *      1、方法名  ：和父类相同
 *      2、返回类型 ： 如果子类中定义的方法，和父类方法仅有范返回类型不同，就会报错
 *      3、参数列表 ： 不同，则认为是扩展了一个新的方法
 *      4、如果想要调用父类的原有的方法，使用super关键字   super.type     super.run();
 *
 * 重载overload ： 同一个方法名称赋予不同的参数去调用
 *      一个类中发生，方法名一致，参数列表不同，返回类型不影响重载
 *      1、方法名： 相同
 *      2、返回类型 : 不影响重载，如果俩个方法只有返回类型不同，那么会报错
 *      3、参数列表 : 不同，会产生重载
 *
 *
 * 重写方法的权限不能低于父类中被重写的方法的访问权限
 * 声明为final的方法不能被重写
 * 构造方法不能被重写
 * 子类如果想要调用父类中的被重写方法，需要使用super关键字
 *
 *
 * super关键字用于子类调用父类中的属性或者方法
 *      super.用于调用父类普通的变量或者方法
 *      super（） 用于调用父类的构造方法，直接传参
 *
 * this关键字用于调用类自己的成员变量和方法
 *
 */

//Animal 为父类，猫扩展动物

public class Cat extends Animal {
    public int claws=4;
    public String voice="秒";
    public String type="猫";
    public static final String kin="动物";

    public Cat(){
        System.out.println("Cat自己的构造方法+ 一只小奶猫");
    }

    public void play(){
        System.out.println("猫会玩哦");
    }
    public void drink(){
        //重写是丰富父类的方法内容
        System.out.println("猫不爱喝水");
        System.out.println("再用动物的方式喝一次");
        //把父类的功能拿到这里重写一遍，在重写的方法里可以调用父类的方法来实现部分功能
        super.drink();
    }
    //造成重载了
    /*public String run(){
        return  "";
    }*/
    public void run(int speed){
        System.out.println("猫咪跑的速度是 "+ speed);
    }

}
