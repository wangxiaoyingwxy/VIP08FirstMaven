package com.testing.class7;

import java.util.Scanner;

/**
 * @author : wangxy
 * @create time ： 2022/5/7
 */
public class PhoneRegex {
    public static void main(String[] args) {
        //写好正则表达式用于验证某些字符串是否符合规则
        Scanner sc=new Scanner(System.in);
        String s="";
        System.out.println("请输入11位数字");
        String phone="1[3-9][0-9]{9}";
        for(int i=0;i<10;i++){
            s=sc.nextLine();
            if(s.matches(phone)){
                System.out.println("是一个电话号码");
            }
            else{
                System.out.println("不是一个电话号码"+s);


            }
        }
    }


}
