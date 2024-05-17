package com.testing.class7;

/**
 * @author : wangxy
 * @create time ： 2022/5/6
 * 注意： java中如果参数列表中的string 的名字叫做regex,说明在使用的时候，这个字符串会使用正则的规则
 * 正则表达式
 *      . 表示任一一个字符
 *      \d   \\d   [0-9]  正则表达式的特殊字符需要转义，要用俩个\\表示
 *      \D   非数字字符
 *      \s   匹配空格字符，等价于[\f\n\r\t\v]
 *      \S   匹配非空格字符
 *      \w   匹配单次类字符，等价于[A-Za-z0-9_]
 *      \W   匹配非单词类字符
 *      ^    匹配字符串开始的位置
 *       $    匹配字符串结束的位置
 *      量词  ----  对它前面的字符表达式生效，通过（）可以将几个元字符组合到一起形成词组表达式来使用量词，量词结合和最近的字符进行结合
 *      *  表示0-N次   .*编程 ---只要最后是编程前面可以是0-N个任一字符  X*---表示X出现0次或者多次 等价于{0，}
 *      ？ 标识 0-1次  X？---表示X出现0次或者1次 等价于{0,1}
 *      X{n,m} ---表示X出现N-M次
 *      +    X+  标识出现一次
 *      贪婪
 *      非贪婪
 *
 *      元字符组  ---- 由多个可能出现的字符组成的元字符组，用[]来组合起来
 *
 */
public class Regexlearn {
    public static void main(String[] args) {
        String java="java编程";
        String python="python编程";
        String programmingRegex=".*编程.*";
        String p="编程";
        //这里的.只是代表.号，不代表任一字符，因为不是作为regex使用
        String dot="....编程";
        //验证字符串是否满足指定的正则表达式
        System.out.println(java.matches(programmingRegex));
        System.out.println(python.matches(programmingRegex));
        String programRegex=".{4,6}编程";
        System.out.println(java.matches(programRegex));
        System.out.println(python.matches(programRegex));
        System.out.println("验证 ..*和.*的区别：..*必须要有1个字符   .*可以有多个也可以没有");
        String doubleDot = "..*编程";
        System.out.println(p.matches(doubleDot));
        System.out.println(p.matches(programmingRegex));


    }
}
