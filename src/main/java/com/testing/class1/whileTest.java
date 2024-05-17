package com.testing.class1;

/**
 * @author : wangxy
 * @create time ： 2022/2/5
 */
public class whileTest {
    public static void main(String []args){
        //while(条件){循环体}
        //while是条件满足再走循环体
        int i = 0;
        while (i<10){
            System.out.println(i);
            i++;
        }
        //不管条件如何，先走一遍循环体
        do{
            System.out.println("这个是"+i);
            i++;
        }while(i<20);
    }
}
