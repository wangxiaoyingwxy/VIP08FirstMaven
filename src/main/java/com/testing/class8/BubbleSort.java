package com.testing.class8;

/**
 * @author : wangxy
 * @create time ： 2022/5/7
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a={2,3,6,1,67,4};
        for(int i:bubbleSir(a)){
            System.out.print(i+" ");
        }
    }
    public static int[] bubbleSir(int[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int type=a[j];
                    a[j]=a[j+1];
                    a[j+1]=type;
                }
            }
        }
        return a;
    }
}
