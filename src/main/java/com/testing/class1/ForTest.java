package com.testing.class1;

/**
 * @author : wangxy
 */
//执行顺序： int i=0，循环控制变量初始值，只执行1次，判断i<100,执行循环体打印i的值，执行循环控制变量的更新，在判断执行
public class ForTest {
    public static void main(String[] args) {
//        for(int row=1;row<10;row++){
//            for(int column=1;column<10;column++){
//                if(row==column||(row+column)==10){
//                    System.out.print("nul ");
//                }else{
//                    System.out.print(row+"*"+column+"\t");
//                }
//                if (column==9){
//                    System.out.println();
//                }
//            }
//        }

        for (int row = 1; row < 10; row++) {
            for (int column = 1; column < 10; column++) {
                System.out.print(row + "*" + column + "\t");
                if (row == column) {
                    System.out.println();
                    break;
                }
            }
        }

    }
}

