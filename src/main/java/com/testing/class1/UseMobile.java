package com.testing.class1;

/**
 * @author : wangxy
 */
public class UseMobile {
    public static void main(String[] args) {
        //类的实例才是对象，声明一个对象
        MobilePhone huawei = new MobilePhone();
        //声明一个int类型的变量
        int a;
        huawei.call();
        int ut = huawei.useTime;
        System.out.println(ut);
        //使用变量，不建议直接使用对象.变量来进行调用，尤其是不建议直接复制修改
        System.out.println(huawei.getResolution());
        huawei.setResolution("修改后的分辨率");
        System.out.println(huawei.getResolution());

    }
}
