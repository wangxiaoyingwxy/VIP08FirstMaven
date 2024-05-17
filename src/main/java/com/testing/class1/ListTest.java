package com.testing.class1;

import java.util.*;

/**
 * @author : wangxy
 * @create time ： 2022/5/3
 */
public class ListTest {
    public static void main(String[] args) {
        //list同样需要指定存储类型
        List<String> royList=new ArrayList<>();
        royList.add("烧烤");
        royList.add("茄子");
        royList.add("火锅");
        royList.add("辣椒");
        //往指定的地方插入元素，注意从0开始
        royList.add(1,"酸菜");
        //集合框架类型  set  list   map  输出可以直接输出内容
        System.out.println(royList);
        //删除下标为1的元素
        royList.remove(1);
        royList.remove("烧烤");
        System.out.println(royList);
        //改，由于list有下标，所以根据下标修改
        royList.set(1,"生蚝");
        System.out.println(royList);
        System.out.println("基于下标遍历");
        for (int i=0;i<royList.size();i++){
            System.out.println(royList.get(i));
        }
        //foreach遍历
        for (String s:royList){
            System.out.println(s);
        }
        //iterator遍历
        Iterator<String> roylit = royList.iterator();
        while (roylit.hasNext()){
            System.out.println(roylit.next());
        }
        //容器结构中不能是基本的数据类型，而应该是java实现的对应的类类型，类类型需要开辟一块空间来存储的（基本类型对应的类类型就是包装类型）
        //int -- integer     char -- character


    }
}
