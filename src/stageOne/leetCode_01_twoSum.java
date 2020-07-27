package stageOne;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class leetCode_01_twoSum {
    public static void main(String[] args) throws Exception {
        int[] nums={3,2,4};
        for(int index:twoSum_3(nums,6))
        System.out.println(index);
    }

    //暴力法
    public static int[] twoSum_0(int[] nums, int target) {

            int[] a=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                a[0]=i;
                a[1]=j;
                }
            }
        }
        return a;
    }


    //两遍哈希
    public static int[] twoSum_1(int[] nums, int target) {
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
    }

    //一遍哈希
    public static int[] twoSum_2(int[] nums, int target) throws Exception {

        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            int Component = target-nums[i];
            if(map.containsKey(Component)){
                /*res[0] = i;
                res[1] = map.get(target - nums[i]);*/
                return new int[] {i,map.get(Component)};
            }
            map.put(nums[i],i);
        }
        throw new Exception("不存在");
    }

    //双指针+排序    但排序改变了元素原来的位置，需要生成副本，有什么办法简便根据排序后的元素找到原来的下标
    public static int[] twoSum_3( int[] nums,int target) throws Exception {

        int[] res = new int[2];
        Arrays.sort(nums);
        for(int head = 0, end = nums.length -1; head < end;) {
            if(nums[head] + nums[end] == target) {
                res[0] = head;
                res[1] = end;
                return res;
            } else if(nums[head] + nums[end] > target) {
                end--;
            }
            else {
                head++;
            }
        }
       throw new Exception("不存在这样的组合");
    }
}
