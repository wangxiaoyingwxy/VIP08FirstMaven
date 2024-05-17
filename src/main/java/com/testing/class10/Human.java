package com.testing.class10;

import com.testing.class9.Animal;
import com.testing.class9.Cat;

/**
 * @author : wangxy
 * @create time ： 2022/5/10
 */
public class Human {
    public void playWithAnimal(Animal a){
        System.out.println("人类正在和"+a.type+"玩耍");
        System.out.println("人类给"+a.type+"渭水河");
        a.drink();
    }
    public void playWithCat(Cat c){
        System.out.println("人类和猫咪玩耍");
        c.play();

    }
}
