//包生明
package com.testing.class1;

/**
 * @author : wangxy
 */
//类声明
//公有权限  类定义  类名
public class MobilePhone {
    //属性、变量、实例域（field）
    public static String produce;
    public int weight = 300;
    public String brand = "华为";
    public String size = "5.3英寸";
    public String type = "手机";
    public int useTime = 20;
    public static String resolution = "分辨率";

    //返回类型、方法名、参数列表
    //void表示返回类型为空
    public void call() {
        //方法体
        System.out.println("打电话");
    }

    public int queryBattery() {
        if (useTime < 30) {
            return 80;
        } else if (useTime < 60) {
            return 90;
        } else {
            return 100;
        }

    }

    public String takePhoto() {
        return "美颜照片";
    }

    public String  getResolution(){
        return  resolution;
    }
    public void setResolution(String resolution){
        this.resolution=resolution;

    }

//    public static MobilePhone buyMobilePhone(){
//        MobilePhone phone = null;
//        return  phone;
//    }
//    public static MobilePhone openMobilePhone(MobilePhone phone){
//        phone = new MobilePhone();
//        return phone;
//    }



}
