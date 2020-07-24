package stageOne;
/*
* 暴力方法以滑动窗口数量作为循环很精妙    补充一下，我是傻逼
*
* */

import java.util.ArrayList;

public class leetCode_239_maxSlidingWindow {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9};
        for(int num:maxSlidingWindow1(nums,3)){
            System.out.println(num);
        }
    }

//    暴力    我是傻逼
    public static int[] maxSlidingWindow1(int[] nums, int k) {
     /*   ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length-k;i++){
            for(int j=k-1;j<nums.length-1;j++){
                int maxNum=Integer.MIN_VALUE;
                for(int q=i;q<j;q++){
                maxNum=Math.max(maxNum,nums[q]);
                arr.add(maxNum);
                }
            }
        }
        return nums;
    */
    int[] output=new int[nums.length-k+1];
    for(int i=0;i<nums.length-k+1;i++){
        int maxNum=Integer.MIN_VALUE;
        for(int j=i;j<i+k;j++){
            maxNum=Math.max(maxNum,nums[j]);
        }
        output[i]=maxNum;
    }
    return output;
    }
}
