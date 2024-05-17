package com.testing.class1;

/**
 * @author : wangxy
 * @create time ： 2022/5/5
 */
public class StringUse {
    public static void main(String[] args) {
        String s ="royteacher";
        //这个容易出现空指针，要是参数没有初始化就会出现空指针
        //try catch提升代码稳定性
        try {
            System.out.println(s.equals("roys"));
        } catch (Exception e) {
            System.out.println("不要这样写，容易空指针");
        }
        //建议用这个
        System.out.println("roys".equals(s));

        //判断字符串是否包含另一个字符串
        System.out.println(s.contains("ro"));
        System.out.println("字符串长度"+ s.length());
        //替换字符串中某些字符
        String res=s.replace("oy","ose");
        System.out.println(res);
        System.out.println(s.indexOf("o"));
        System.out.println(s);
        String s1=s.substring(2);
        System.out.println(s1);
        //取值，左闭右开 [3,5)
        String s2=s.substring(3,5);
        System.out.println(s2);

        StringBuffer sb=new StringBuffer();
        sb.append("roy");
        sb.append("laosh");
        System.out.println(sb);
        String ss=sb.reverse().toString();
        System.out.println(ss);

    }
}
