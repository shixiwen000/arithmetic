/*
    1.暴力法，三重循环
    2.哈希表
    3.排序+双指针
    4.处理重复元素

 */
package stageOne;
import java.util.*;

public class leetCode_15_threeSum {
    public static void main(String[] args) {
        int[] num={1,2,-3,4,5,-9,3,7};
        Iterator<List<Integer>> it=threeSum(num).iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int k=0;k<nums.length-2;k++){
            if(k>0&&nums[k]==nums[k-1]) {
                continue;
            }
            for(int i=k+1,j=nums.length-1;i<j;){
                if(nums[k]+nums[i]+nums[j]==0){
                    list.add(Arrays.asList(nums[k],nums[i++],nums[j--]));
                    while(i<j&&nums[i]==nums[i-1]){i++;}
                    while(i<j&&nums[j]==nums[j+1]){j--;}
                }

                else if(nums[k]+nums[i]+nums[j]<0){
                    i++;
                }
                else{
                    j--;
                }
            }
        }
        return list;
    }
/*
    public static List<List<Integer>> threeSum(int[] num){
        Arrays.sort(num);
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        System.out.println("c a b");
        for(int i=0;i<num.length-2;i++){
            for(int j=i+1;j<num.length-1;j++){
                for(int k=j+1;k<num.length;k++){
                    if(0==num[i]+num[j]+num[k]){
                        List<Integer> arr=new ArrayList<Integer>();
                        arr.add(num[i]);
                        arr.add(num[j]);
                        arr.add(num[k]);
                        list.add(arr);
                    }
                }
            }
        }
        return list;
    }
*/
}
