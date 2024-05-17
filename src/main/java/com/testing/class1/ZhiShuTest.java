package com.testing.class1;

/**
 * @author : wangxy
 * @create time ： 2022/2/5
 */
public class ZhiShuTest {
    public static void main(String[] args) {
        for (int x=2;x<=100;x++){
            if(x==2){
                System.out.println(" "+ x);
                continue;
            }
            for (int i=2;i<x;i++){
                if(x%i==0){
                    break;
                }
                if(i==(x-1)&&x%i!=0){
                    System.out.println(" "+ x);
                }




            }

        }
    }
}
