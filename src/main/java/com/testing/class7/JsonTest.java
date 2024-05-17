package com.testing.class7;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.testing.class8.SelectionSort;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : wangxy
 * @create time ： 2022/5/7
 * json 格式是字符串
 *      键必须用“”引起来
 *      值不一定：数字不需要，字符串需要
 * json 的值
 *      数字
 *      字符串
 *      逻辑值
 *      数组  {“teach，["roy","will"]”}
 *      对象 {”course“：{"teacher":"roy","course":"java"}}
 *      null
 *
 */
public class JsonTest {
    public static void main(String[] args) {
        String ipStr="jQuery110206878449851837694_1651906918575({\"Srcid\":\"5809\",\"ResultCode\":\"0\",\"status\":\"0\",\"QueryID\":\"1835373410\",\"Result\":[{\"DisplayData\":{\"strategy\":{\"tempName\":\"ip\",\"precharge\":\"0\",\"ctplOrPhp\":\"1\"},\"resultData\":{\"tplData\":{\"srcid\":\"5809\",\"resourceid\":\"5809\",\"OriginQuery\":\"3.3.3.3\",\"origipquery\":\"3.3.3.3\",\"query\":\"3.3.3.3\",\"origip\":\"3.3.3.3\",\"location\":\"\\u7f8e\\u56fd \\u4e9a\\u9a6c\\u900a\\u4e91\",\"userip\":\"\",\"showlamp\":\"1\",\"tplt\":\"ip\",\"titlecont\":\"IP\\u5730\\u5740\\u67e5\\u8be2\",\"realurl\":\"http:\\/\\/www.ip138.com\\/\",\"showLikeShare\":\"1\",\"shareImage\":\"1\",\"data_source\":\"AE\"},\"extData\":{\"tplt\":\"ip\",\"resourceid\":\"5809\",\"OriginQuery\":\"3.3.3.3\"}}},\"ResultURL\":\"http:\\/\\/www.ip138.com\\/\",\"Weight\":\"2\",\"Sort\":\"1\",\"SrcID\":\"5809\",\"ClickNeed\":\"0\",\"SubResult\":[],\"SubResNum\":\"0\",\"ar_passthrough\":[],\"RecoverCacheTime\":\"0\"}],\"data\":[{\"srcid\":\"5809\",\"resourceid\":\"5809\",\"OriginQuery\":\"3.3.3.3\",\"origipquery\":\"3.3.3.3\",\"query\":\"3.3.3.3\",\"origip\":\"3.3.3.3\",\"location\":\"\\u7f8e\\u56fd \\u4e9a\\u9a6c\\u900a\\u4e91\",\"userip\":\"\",\"showlamp\":\"1\",\"tplt\":\"ip\",\"titlecont\":\"IP\\u5730\\u5740\\u67e5\\u8be2\",\"realurl\":\"http:\\/\\/www.ip138.com\\/\",\"showLikeShare\":\"1\",\"shareImage\":\"1\"}],\"ResultNum\":\"1\"})";
        //获取字符串中的第一个指定符号下标
        char ipRestr=ipStr.charAt(42);
        System.out.println(ipRestr);
        int index=ipStr.indexOf("{");
        System.out.println(index);
        //获取{}之间的json内容
        String ipfmStr=ipStr.substring(ipStr.indexOf("{"),ipStr.length()-1);
        System.out.println(ipfmStr);

        //解析字符串ipfmstr为一个json对象 ipjson
        JSONObject ipJson=JSON.parseObject(ipfmStr);
        System.out.println(ipJson);
        Map<String,Object> IPmap=new HashMap<>();
        //遍历所有的key，从而完成json对象的遍历
        for(String key:ipJson.keySet()){
            System.out.println("键是 "+key+"值是 "+ipJson.get(key));
            IPmap.put(key,ipJson.get(key));
        }
        System.out.println("map的结果是 "+ IPmap);

        //通过parse方法，解析出来的是一个object对象，直接强转成Map<String,Object>
        Map<String,Object> fomMap=(Map<String,Object>)JSON.parseObject(ipfmStr);
        //输出的结果是：链接的，原因是因为map的强转源头是json解析出来的对象，而这个对象的tosstring方法输出方式时按照json方式拼接的，所以这个map的输出结果和普通的map不一样
        System.out.println("强转map的结果是 "+fomMap);


        //拼接map内容作为字符串
        String convertStr="{";
        //判断键的值是不是字符串
        for(String key:fomMap.keySet()){
            String maohao=":";
            String valuePart="";
            String keyPart="\""+key+"\"";
            if(fomMap.get(key) instanceof String){
                //如果值是字符串，则需要加上“”号,如果不是字符串就不需要
                valuePart="\""+fomMap.get(key)+"\"";
            }
            else{
                valuePart=fomMap.get(key).toString();
            }
            //System.out.println(key+maohao+valuePart);
            convertStr+=keyPart+maohao+valuePart+",";
        }
        convertStr+="}";
        convertStr=convertStr.replace(",}","}");
        System.out.println(convertStr);






    }
}
