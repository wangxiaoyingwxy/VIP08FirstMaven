package com.testing.class1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : wangxy
 * @create time ： 2022/5/5
 */
public class Homework5 {
    public static void main(String[] args) {
        Integer[] a={1,2,3,4,5,6,7,8,9};
        //从数组中取元素存到list中
        List<Integer> list = new ArrayList<>();
        //foreach 直接存
        for(Integer i:a){
            list.add(i);
        }
        System.out.println("foreach存值"+ list);

        for(int i=0;i<a.length;i++){
            list.add(a[i]);
        }
        System.out.println("基于for循环存值"+list);

        //使用Arrays中的aslist
        Arrays.asList(a);
        System.out.println("基于aslist转换"+list);


        //list转换成数组
        //存数组先初始化一个数组,仅知道长度和list长度一直
        Integer[] result = new Integer[list.size()];
        //toArray 方法，可以接受一个参数，参数的类型为数组类型，那么会将list的内容传递到这个数组内
       /* list.toArray(result);
        System.out.println("输出转换后的数组");
        for(int i:result){
            System.out.print(i+"  ");
        }*/
        //无参的toArray方法，返回的类型是一个object【】数组。所以接受的时候，需要类型强制转换
        result=(Integer[]) list.toArray(new Integer[list.size()]);
        System.out.println("");
        for(int i:result){
            System.out.println("toArray[object]"+i);
        }

    }
}
