package com.testing.class8;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author : wangxy
 * @create time ： 2022/5/7
 */
public class HomeWork7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入邮箱号");
        String input = sc.nextLine();
        System.out.println(checkMail(input));
        DataJson();
    }

    public static boolean checkMail(String input) {
        boolean result = false;
        //查邮箱格式，用户名@邮箱服务器域名.一级域名    .com  .org  .edu  .cn
        //匹配的是一个普通的 .号，正则用 \\.
        String emailRegex = "\\w{3,16}@\\w{2,16}\\.(com|org|edu|cn)";
        if (input.matches(emailRegex)) {
            result=true;
        }
        return  result;

    }
    public static void DataJson(){
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
        Object datajson=IPmap.get("data");
        System.out.println(datajson);









        //解析出来直接就是jsonarray格式
        JSONArray dataArray=(JSONArray)datajson;
        JSONObject dataIsonOb=(JSONObject)dataArray.get(0);
        for(String s:dataIsonOb.keySet()){
             System.out.println("键是 "+s+"值是 "+dataIsonOb.get(s));
        }
        //解析出来看做一个字符串，去掉前后[],就是一个json对象可以进行处理
        String dataStr=datajson.toString();
        System.out.println("将data转换成String"+dataStr);
        String dataJsonStr=dataStr.substring(1,dataStr.length()-1);
        JSONObject dataStr2Json=JSON.parseObject(dataJsonStr);
        for(String s:dataStr2Json.keySet()){
            System.out.println("键是 "+s+"值是 "+dataStr2Json.get(s));
        }
    }

}
