package com.testing.class7;

/**
 * @author : wangxy
 * @create time ： 2022/5/6
 *
 *
 */
public class RegexLearnJavaAndPython {
    public static void main(String[] args) {
        String java="java编程";
        String python="python编程";
        String C="c编程";
        //必须是java python中出现的字符，后面带上编程俩个字
        //[] 表示一个元字符组，里边可以进行交叉并运算,仅匹配一个字符串中的字符，元字符组中的内容不是一个整体，而是一个字符的可能性
        //词组  （） 用于组成词组，词组中内容作为一个整体来进行匹配
        //String中的matches方法，是从头到尾匹配的，默认带上了开始和结束的标识
        String regex="[Javpythonc]编程";
        System.out.println(java.matches(regex));
        System.out.println(python.matches(regex));
        System.out.println(C.matches(regex));
        String regex1="[Javpythonc][Javpythonc][Javpythonc][Javpythonc]编程";
        String regex2="[Javpythonc]*编程";
        String regex3="[Javpythonc]{4}编程";  //---这里面的字符出现4次
        //前面必须是java
        String regex4="(java)编程";
        String regex5="javajavajavajava编程";
        String regex6="(java){4}编程";
        System.out.println(java.matches(regex4));


    }
}
