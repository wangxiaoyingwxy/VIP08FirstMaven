package com.testing.class1;

/**
 * @author : wangxy
 * @create time ： 2022/4/15
 */
public class Dog {
    String name;
    int age;
    public Dog(){

    }
    public Dog(String name){
        this.name=name;
    }
    public Dog(int age,String name){
        this.age=age;
        this.name=name;
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
