package com.testing.class1;

/**
 * @author : wangxy

 */
public class Ninetest {
    public static void main(String[] args) {
        int row = 1;
        while(row<=9){
            int column = 1;
            while (column<=9){
                if(row==column||(row+column)==10){
                    column++;
                    System.out.print("nul ");
                    if(column==10){
                        System.out.println();
                        break;
                    }
                }
                System.out.print(row+"*"+column+'\t');
                column++;
                if(column==10){
                    System.out.println();
                }
            }
            row++;
        }
    }
}
