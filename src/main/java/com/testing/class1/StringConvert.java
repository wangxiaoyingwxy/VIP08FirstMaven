package com.testing.class1;

/**
 * @author : wangxy
 * @create time ： 2022/5/5
 */
public class StringConvert {
    public static void main(String[] args) {
        int a = 34;
        Integer i = 35;
        //1、通过String类的静态方法valueof进行转换
        String sa = String.valueOf(a);
        //2、判断类型的运算符，判断某个对象是否是instanceof后面的类型对象、
        boolean b = sa instanceof String;
        //3、直接输出一个类类型对象的时候，默认就是调用tostring的方法之后，再输出
        Dog xiaobai = new Dog();
        String dogstr=xiaobai.toString();
        System.out.println(dogstr);
        System.out.println(xiaobai);
        //基本数据类型不是一个类，没有变量和方法
        //Int的包装类Integer是有变量和方法的
        i.toString();

    }
}
