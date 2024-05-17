package com.testing.class8;

/**
 * @author : wangxy
 * @create time ： 2022/5/9
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] input={3,6,44,9,33,88,0,18,20};
        int[] result=quickSort(input,0,input.length-1);
        for(int i:result){
            System.out.println(i+"  ");
        }

    }
    public static int[] quickSort(int [] input,int low,int high){
        int left=low;
        int right=high;
        int base=input[left];
        while (left<right){
            //从左往右排
            while (left>right){
                if(input[right]>base){
                    right--;
                }
                //如果当前的right下标的值小于基准值，那么交换基准值（下标为left）和right的位置的值，基准值的下标是right
                //left++
                //切换为从左往右遍历
                else{
                    int tmp=input[left];
                    input[left]=input[right];
                    input[right]=tmp;
                    //left++
                    left++;
                    //切换从左往右的遍历
                    break;
                }
            }
            while (left<right){
                if(input[left]<base){
                    left++;
                }else{
                    int tmp=input[left];
                    input[left]=input[right];
                    input[right]=tmp;
                    right--;
                    break;
                }
            }
        }
        if(low>=left-1){
            //啥也不做
        }else{
            quickSort(input,low,left-1);
            }
            if(right+1>=high){
            //啥也不做
        }else{
            quickSort(input,right+1,high);
            }
            return input;
    }
}
