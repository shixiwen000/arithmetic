package stageOne;

import java.util.HashMap;

public class leetCode_01_twoSum {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        for(int index:twoSum(nums,4))
        System.out.println(index);
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] a=new int[2];
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                a[0]=i;
                a[1]=map.get(target-nums[i]);
            }
        }
        return a;
        /* int[] a=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                a[0]=i;
                a[1]=j;
                }
            }
        }
        return a;*/
    }
}
