package com.testing.class10;

/**
 * @author : wangxy
 * @create time ： 2022/5/10
 *
 * 接口就类似写一个类的模板，告诉这个类需要实现一些什么样的方法，至于具体的实现，由实现类来自己定义，接口不管
 *
 */
public interface Employer {
    //接口中值允许有static  final 修饰的常量，所以通常变量名直接大写  static he final 可以省略
    public String TYPE="苦逼的社畜";
    //接口当中只允许存在抽象方法
    public void work();
    //很少用
    //可以呦默认的定义方法，由default来修饰
    public default  void jiaban(){
        System.out.println("社畜一般都是996");
    }
    //方法的定义同样可以自由指定，默认是public abstract  。包括返回类型，方法名、参数列表
    //
    public String moyu(int time);
    //jdk1.8后，接口可以呦静态方法，静态方法需要方法体
    //接口中静态方法需要方法体
    public static  void drink(){
        System.out.println("社畜也需要喝水");
    }

}
