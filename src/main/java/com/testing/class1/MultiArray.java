package com.testing.class1;

/**
 * @author : wangxy
 * @create time ： 2022/5/3
 */
public class MultiArray {
    public static void main(String[] args) {
        //二维数组
        int[][] doublei = new int [9][9];
        for(int i=0;i<doublei.length;i++){
            //取二维数组的i+1个
            int[] a = doublei[i];
            //对于每个一维数组的元素赋值
            for(int j=0;j<a.length;j++){
                doublei[i][j]=(i+1)*(j+1);
            }
        }


        System.out.println(doublei[2][3]);
        //二位数组存放的是一维数组
        for(int[] a:doublei){
            System.out.println(a);
            for(int i: a){
                System.out.print(i);
            }
        }
    }

}
