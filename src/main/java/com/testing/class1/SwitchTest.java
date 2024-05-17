package com.testing.class1;

import java.util.Scanner;

/**
 * @author : wangxy
 */
public class SwitchTest {
    public static void main(String[] args) {
        System.out.println("请输入");
        Scanner sc = new Scanner(System.in);
        String gift = sc.nextLine();
        //好感度
        int exp = 50;
        //switch (选项变量){case 变量值，满足该变量值就break }
        //break 是跳出循环
        switch (gift) {
            case "口红":
                System.out.println("送的口红哈");
                exp+=10;
                break;
            case "房子":
                System.out.println("送的房子哈");
                exp+=20;
                //防止死循环，条件控制住
                while(exp<90){
                    System.out.println("不错啊，继续努力");
                    exp+=5;
                    //break;
                }
                break;
            default:
                System.out.println("不喜欢的");
                exp+=5;
        }
        System.out.println("exp= " + exp);


    }
}
