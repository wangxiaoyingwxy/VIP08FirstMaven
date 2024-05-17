package com.testing.class7;

/**
 * @author : wangxy
 * @create time ： 2022/5/7
 */
public class DotRegexTest {
    public static void main(String[] args) {
        String dot="...编程";
        String java="java编程";
        String jjj="jjj编程";
       // []由于括起来的只能表示一个字符，如果要表示多个词组的可能性就用|
       String regex2="(java|python)编程";

        System.out.println(java.matches(regex2));
        System.out.println(jjj.matches(regex2));


        String regex=".{4}编程";
        String regex1="\\.{3}编程";
        System.out.println(dot.matches(regex));
        System.out.println(java.matches(regex));
        System.out.println(dot.matches(regex1));
        System.out.println(java.matches(regex1));




    }

}
