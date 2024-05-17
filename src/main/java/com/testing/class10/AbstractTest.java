package com.testing.class10;

/**
 * @author : wangxy
 * @create time ： 2022/5/10
 */
public class AbstractTest {
    public static void main(String[] args) {
        AbstractC ab=new AbExtends();
        /*AbstractC ab=new AbstractC() {
            @Override
            public void silent() {
                System.out.println("我是一个不会说话的抽象方法");
            }
        };*/
        ab.silent();
        ab.sound();
    }
}
