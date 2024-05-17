package com.testing.class1;

import java.util.Scanner;

/**
 * @author : wangxy
 * @create time ： 2022/2/1
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        int a = sc.nextInt();
        if(a > 5 && a << 8-7>20 || !(a++ < 15)){
            System.out.println("a 满足条件");
        }
        System.out.println("if执行完了");

        if(a > 0){
            System.out.println("a>0");
        }
        else{
            System.out.println("a<0");
        }
        System.out.println("不知道是啥了");
    }
}
