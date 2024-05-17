package com.testing.class1;

import java.util.*;
import java.util.Map.Entry;



/**
 * @author : wangxy
 * @create time ： 2022/5/5
 * map的特征
 *      存储的内容格式是键值对格式<键，值>
 *              和set一样是无序的
 *              map没有下标，只能用foreach
 *      增
 *      scoreMap.put("roy",890);
 *      删
 *      改
 *      查
 *idea 引入一些接口中的子接口，可能需要手动引入jar包，比如importjava。util。Map。Entry；entry是Map中子模块
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> scoreMap = new HashMap<>();
        //增
        scoreMap.put("病态",90);
        scoreMap.put("roy",60);
        scoreMap.put("610",610);
        //不允许出现相同的键，可以是相同的值
        scoreMap.put("haha",80);
        scoreMap.put("haha",90);

        //删
        scoreMap.remove("病态");
        scoreMap.remove("roy",30);
        //改
        scoreMap.put("haha",100);
        scoreMap.replace("haha",110);
        //查
        System.out.println(scoreMap);

        //1、基于键遍历,只能把值拿出来,通过键值的方法拿到值  scoreMap.get(key)
        for(String key:scoreMap.keySet()){
            System.out.println("姓名是"+ key + "分数"+ scoreMap.get(key));
        }

        //2、基于键值对来进行遍历
        //键值对使用的是entry，对应的是map中的entryset
        System.out.println("++++基于entry来遍历+++++");
        for(Entry<String ,Integer> e:scoreMap.entrySet()){
            System.out.println(e);

        }
        System.out.println("++++for循环遍历++++");
        for(Integer i:scoreMap.values()){
            System.out.println(i);
        }
        //基于迭代器遍历
        //scoreMap.keySet() 得到的是一个set类型对象，因此可以调用set方法
        System.out.println("++++基于迭代器遍历++++");
        Set<String> mapkeys=scoreMap.keySet();
        mapkeys.iterator();
        Iterator<String> mit = scoreMap.keySet().iterator();
        Set<String> keys = scoreMap.keySet();
       /* for(String s : keys) {
            Iterator<Integer> score=scoreMap.get(s);
        }*/
        Collection<Integer> values = scoreMap.values();
        Iterator<Integer> iterator = values.iterator();
        while(iterator.hasNext()) {
            System.out.println("键是"+iterator.next());
        }
        while(mit.hasNext()){
            //只取一次值，把值存起来
            String key=mit.next();
            System.out.println("键是"+key+ "值是"+scoreMap.get(key));
        }
    }
}
