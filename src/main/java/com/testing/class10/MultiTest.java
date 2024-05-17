package com.testing.class10;

import com.testing.class9.Animal;
import com.testing.class9.Cat;
import com.testing.class9.Rabbit;

/**
 * @author : wangxy
 * @create time ： 2022/5/10
 *
 *向上转型产生的效果
 * 1、调用方法的时候，子类如果被重写，那么会调用子类重写的方法
 * 同样类型的对象调用一个方法时，产生了不一样的效果，因为在子类内部把父类的方法重写了
 * 2、进行了向上转型之后，子类进行了扩充，将会被隐藏
 * 3、向上转型不能操作子类新增的变量或者方法，但是可以使用子类继承或重写的方法，也就是说在父类定义的方法都可以使用
 *
 * 方法在调用的时候
 *          如果使用的参数是父类对象，那么传递子类对象是可以自动完成向上转型的
 *          如果使用的参数是子类对象，那么传递父类对象必须手动强制完成向下转型，转换为子类对象再使用
 *
 */
public class MultiTest {
    public static void main(String[] args) {
        //父类调用子类对象
        Animal a =new Cat();
        //向上转型
        Animal b = new Rabbit();
        Cat c=new Cat();
        //同样类型的对象调用相同的方法的时候，产生了不一样的结果
        a.drink();
        b.drink();

        System.out.println("===========");
        Human roy=new Human();
        roy.playWithAnimal(a);
        roy.playWithAnimal(b);
        System.out.println("======只针对猫来调用");

        roy.playWithAnimal(a);
        roy.playWithCat(c);
        roy.playWithCat((Cat)a);
        roy.playWithAnimal(c);
        //如果方法调用得是子类的对象，那么可以通过强制向下转型完成调用
        //子类对象在进行调用的时候，如果方法使用的父类对象，那么调用的时候传递了子类对象是可以
        //如果方法调用的是子类对象，传了父类对象进来要强转成子类对象



               ((Cat) a).play();

        System.out.println("=====向下转型========");
        Cat downCat=(Cat)a;
        //向下转型的对象，用的是子类重写的方法
        downCat.drink();
        //2、对象向下转型之后，原本隐藏起来的子类扩展方法，就可以重新调用了
        downCat.play();
        //父类对象不能直接转换为子类对象，但是可以强转
        //只有子类类型对象通过向上转型而产生的父类对象，才能向下转型为子类对象
        Animal an=new Animal();
        Cat downan=(Cat)an;
        downan.play();

    }
}
