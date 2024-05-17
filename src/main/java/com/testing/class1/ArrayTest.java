package com.testing.class1;


import java.util.Arrays;

/**
 * @author : wangxy
 * @create time ： 2022/4/15
 */

//数组在初始化的时候长度是固定的
public class ArrayTest {
    public static void main(String[] args) {
        //
        //创建一个长度为3的数组
        int[] ia = new int[3];
        //直接赋初值的初始化方式
        int[] ib = {11,22,15,18,33,29};
        String[] sa ={"roy","haha","heihei"};
        Dog[] d= new Dog[2];
        //构造自定义类型的数组
        Dog[] d1 = {new Dog("小黑"),new Dog("小白")};
        //输出的内容格式其实是类型@hash码
        //hash码其实是根据对象在内存中的存储地址进行哈希计算后得到的一个值，能够唯一代表内存的地址
        //因此可以看做哈希码是内存地址编号，16进制的
        System.out.println(ia);
        System.out.println(d);
        System.out.println(d1);
        //查，遍历的时候，下标从0开始
        //通过下标获取数组的元素
        System.out.println(ib[1]);
        for(int index=0;index<ia.length;index++){
            System.out.println(ia[index]);
        }

        for(int index=0;index<sa.length;index++){
            System.out.println(sa[index]);
        }
       //
        for(Dog d2:d){
            System.out.println(d2);
        }
        //改就是指定元素赋值
        ia[0]=1;
        ia[1]=2;
        for(int i:ia){
            System.out.println(i);
        }
        //调用静态方法fill，为数组全部填充值4
        Arrays.fill(ia,4);
        for(int i=0;i<ia.length;i++){
            System.out.println(ia[i]);
        }
        Arrays.sort(ib);
        for(int i=0;i<ib.length;i++){
            System.out.println(ib[i]);
        }






    }
}
