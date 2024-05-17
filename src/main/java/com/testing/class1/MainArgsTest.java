package com.testing.class1;

/**
 * @author : wangxy
 * @create time ： 2022/5/5
 *
 */
public class MainArgsTest {
    public static void main(String[] args) {
        try {
            String param1 =args[0];
            String param2 =args[1];
            //
            try {
                Integer i1=Integer.parseInt(param1);
                Integer i2=Integer.parseInt(param2);
                if(i1<i2){
                    System.out.println("参数1小于参数2");
                }
                else if(i1==i2){
                    System.out.println("参数1等于参数2");
                }
                else{
                    System.out.println("参数1大于参数2");
                }
            } catch (NumberFormatException e) {
                System.out.println("这里输入的不是数字");
            }


            System.out.println(param1);
            System.out.println(param2);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("输入的内容有问题");
        }
    }
}
