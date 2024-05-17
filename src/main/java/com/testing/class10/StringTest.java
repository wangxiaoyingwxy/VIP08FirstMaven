package com.testing.class10;




import java.io.BufferedReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : wangxy
 * @create time ： 2022/5/23
 */
public class StringTest {
    public static void main(String[] args) {

//        List<String> list = getStractivityCodeList_();
        List<String> list = getStractivityCodeList();
      list.stream().forEach( str -> {
            System.out.println(str);
        });

    }
    public static List<String> getStractivityCodeList_() {
        FileReader fr= null;
        List<String> activityCodeList = new ArrayList<String>();
        try {
            fr = new FileReader("D:/bbb.txt");
            BufferedReader br=new BufferedReader(fr);
            String line="";
            String[] arrs=null;
            String allLine = "";
            while ((line=br.readLine())!=null) {
                if(line != null && !line.equals("") && line.contains("activityCode")) {
                    allLine += line;
                    System.out.print(allLine);
                }

            }
            String[] split = allLine.split(",");
            for(String str : split) {
                if(str != null && !str.equals("") && str.contains("activityCode")) {
                    String[] split_ = str.split(":");
                    String val = split_[2];
                    if(val != null && !val.equals("")) {
                        val = val.replaceAll("\"","");
                        val = val.replaceAll(",","");
                        activityCodeList.add(val);
                        System.out.println(val);
                    }
                }
            }

            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return activityCodeList;
    }

    public static List<String> getStractivityCodeList() {
        FileReader fr= null;
        List<String> activityCodeList = new ArrayList<String>();
        try {
            fr = new FileReader("D:/aaa.txt");
            BufferedReader br=new BufferedReader(fr);
            String line="";
            String[] arrs=null;
            while ((line=br.readLine())!=null) {
                if(line != null && !line.equals("") && line.contains("activityCode")) {
                    String[] split = line.split(": ");
                    String val = split[1];
                    if(val != null && !val.equals("")) {
                        val = val.replaceAll("\"","");
                        val = val.replaceAll(",","");
                        activityCodeList.add(val);
                        System.out.println(val);
                    }
                }

            }

            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return activityCodeList;
    }

}
