package com.testing.class1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author : wangxy
 * @create time ： 2022/5/3
 */
public class SetTest {
    public static void main(String[] args) {
        //set的元素是无序的，不能存重复的元素
        //不要把自己的类取名和第三方库的类一样的名字
        Set set= new HashSet<String>();
        //存储容器是set，类型是String
        Set<String> roySet=new HashSet<String>();
        //增
        roySet.add("茶园悦色");
        roySet.add("喜茶");
        roySet.add("奈雪的查");
        roySet.add("双双");
        roySet.add("双双");
        //集合框架类型  set  list   map  输出可以直接输出内容
        //删
        roySet.remove("喜茶");
        System.out.println(roySet);
        //改;
        //遍历，没有下标，可以foreach  或者iter
        for(String s:roySet){
            System.out.println(s);
        }
        //迭代器遍历,记得每次取值next之前都判断一个是否有hasnext
        Iterator roysit=roySet.iterator();
        //roysit 可以看成是抽奖的人
        //先判断是否还有下一个值
        while(roysit.hasNext()){
            //取出下一个球,  取完就没有这个值了
            System.out.println(roysit.next());
        }
    //  list 可以扩容,也可以根据下标来修改删除
        //
    }
}
