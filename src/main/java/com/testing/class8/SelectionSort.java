package com.testing.class8;

/**
 * @author : wangxy
 * @create time ： 2022/5/7
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] a={2,3,6,1,67,4};
        for(int i:selectionSort(a)){
            System.out.print(i+" ");
        }

    }
    public static int[] selectionSort(int[] a){
        for(int lun=1;lun<=a.length-1;lun++){
            int min=a[lun-1];
            int mini=lun-1;
            for(int index=lun;index<=a.length-1;index++){
                if(a[index]<min){
                    min=a[index];
                    mini=index;
                }
            }//循环比较完会找到最小的数和他的位置
            //交换最小值的位置和当前lun-1小标的位置
            //若果第lun个数不是最小的数，则交换a[mini]和a[lun-1]
            if(min!=a[lun-1]){
                //因为a[mini]的值就是min，相当于已经把水到出来
                a[mini]=a[lun-1];
                a[lun-1]=min;

            }

        }
        return a;
    }
}
