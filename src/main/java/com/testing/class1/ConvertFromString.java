package com.testing.class1;

/**
 * @author : wangxy
 * @create time ： 2022/5/5
 *  try  catch 语句捕获异常,当语句可能出现异常时，为了让代码继续运行，加上try catch机制，
 *  尝试执行语句中的代码，如果不报异常就能正常执行，若果报异常，进入catch语句中的代码
 *  finally不论是否抛异常，都走finally
 */
public class ConvertFromString {
    public static void main(String[] args) {
        String is="1234";
        System.out.println(is+3);
        //解析int，integer可以自动转换成int
        int i=Integer.parseInt(is);
        Integer ii=Integer.parseInt(is);
        System.out.println(i);
        System.out.println(ii);
        String fs="123.4";
        float f = Float.parseFloat(fs);
        Float ff = Float.parseFloat(fs);
        //类型不匹配会报异常,没有进行处理的话，就不会往下处理
        try {
            int fi=Integer.parseInt(fs);
        } catch (NumberFormatException interror) {
            //输出异常信息
            //interror.printStackTrace();
            System.out.println("转换出错了");

        }finally {
            //不管抛不抛异常，就走这个语句
            System.out.println(ff);
        }
        System.out.println(ff);
    }
}
