package com.testing.class8;

/**
 * @author : wangxy
 * @create time ： 2022/5/8
 * 递归尽量不用，如果要用，要有退出递归的条件
 * 做的事情可以化成子问题，
 *
 */
public class RecursionTest {
    public static void main(String[] args) {

        test(2);
        System.out.println(jiecheng(3));
        System.out.println("斐波那契"+phib(9));
        System.out.println("斐波那契数组"+phibArray(9));
    }
    public static void test(int n){
        //不停的在给开方法开辟内存空间
        n++;
        System.out.println("这是递归测试");
        if (n<5){
            test(n);
        }
    }

    //阶乘计算  n!=n*(n-1)!
    public static int jiecheng(int n){
        int result=1;
        if(n==1){
            result=1;
        }else{
            result=n*jiecheng(n-1);
        }
        return result;
    }
    //斐波那契数计算，第n个值是  n-1+n-2的值
    public static int phib(int n){
        int result=0;
        if(n==1){
            result=0;
        }else if(n==2){
            result=1;
        } else {
            result=phib(n-1)+phib(n-2);
        }
        return result;
    }
    public static int phibArray(int xiang){
        int[] a=new int[xiang];
        a[0]=0;
        a[1]=1;
        for (int n=2;n<a.length;n++){
            a[n]=a[n-1]+a[n-2];
        }
        return  a[xiang-1];
    }


}
