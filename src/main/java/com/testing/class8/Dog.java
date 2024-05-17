package com.testing.class8;

/**
 * @author : wangxy
 * @create time ： 2022/4/15
 * 重载是多态的一种表现
 * 在一个类中出现多个同名的方法（可以是构造方法）
 * 参数个数或者类型不一样
 *
 *
 */
public class Dog {
    public int age=0;
    public String name="小狗狗";
    public String ear="尖耳朵";
    //狗的不通过阶段叫声不一样
    public static final String LITTLE_DOG_BARK="呜呜";
    public static final String Big_DOG_BARK="汪汪";
    public static final String Old_DOG_BARK="嗷嗷";

    //在类中默认有一个无参的构造方法
    //同名发放要遵循，参数的类型不一样
    public Dog(){

    }
    public Dog(String name) {
        this.name=name;
    }
    public Dog(int age){
        this.age=age;
    }
    public Dog(int age,String name,String ear){
        this.age=age;
        this.name=name;
        this.ear=ear;
    }
    public Dog(int age, String name){
        this.age=age;
        this.name=name;
    }
    public void bark(){
        int barktimes=3;
        if (age < 3 && age >= 0) {
            System.out.println("小狗"+ name +LITTLE_DOG_BARK+"叫"+barktimes+"次");
        }else if(age<6){
            System.out.println("大狗"+ name +Big_DOG_BARK+"叫"+barktimes+"次");
        }else{
            System.out.println("老狗"+ name +Big_DOG_BARK+"叫"+barktimes+"次");
        }
    }

    //根据心情判断如何叫
    public void bark(String mood){
        if("happy".equals("mood")){
            System.out.println("狗狗的情绪是"+mood+"他对你"+Big_DOG_BARK+"叫");
        }else{
            System.out.println("狗狗不高兴，情绪是"+mood+"他对你"+Old_DOG_BARK+"叫");
        }
    }

    public static void showBark(){
        System.out.println("小狗的叫声是" +LITTLE_DOG_BARK);
    }
    public int getAge(){
        return age;
    }
    public String name(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String toString() {
        return "这是" + age + "岁" + "名字是" + "name" + "的狗";

    }

}
