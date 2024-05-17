package com.testing.class1;

/**
 * @author : wangxy
 * @create time ： 2022/5/6
 */
public class RegexTest {
    public static void main(String[] args) {
        String s="[1,2,3,4,5,6]";
        //s=s.replace("1","X");
       /* for(int i =0;i<s.length();i++){
            s=s.replace(i+"","x");
        }
*/
        System.out.println(s);
        String regex="[1-5]";
        String all =s.replaceAll(regex,"X");  //        String all =s.replaceAll(regex,"");

        System.out.println(all);
        String first=s.replaceFirst(regex,"X"); //        String all =s.replaceAll(regex,"");

        System.out.println(first);

        //用于通过分割符切割成数组

        String[] nos=s.split("[,\\[\\]]");
        for(String No:nos){
            System.out.println(No);
        }

    }
}
