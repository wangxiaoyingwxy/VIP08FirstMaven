package com.testing.class1;


import java.util.Scanner;

/**
 * @author : wangxy
 */
public class GiftTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int exp = 0;
        for (int i =0;i<10;i++){
            System.out.println("请送礼物");
            String s = sc.nextLine();
            System.out.println("送的是" +s);
        }
    }
}
