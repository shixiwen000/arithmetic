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
        int[] num={1,2,2,-3,4,5,-9,3,7};
        Iterator<List<Integer>> it=threeSum_1(num).iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    //暴力求解  如何去重
    public static Set<List<Integer>> threeSum_0(int[] nums) {

        Set<List<Integer>> res = new HashSet<List<Integer>>();
        for(int i =0;i < nums.length - 2; i++) {
            for(int j = i + 1; j < nums.length - 1; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> arr = new ArrayList<Integer>();
                        arr.add(nums[i]);
                        arr.add(nums[j]);
                        arr.add(nums[k]);
                        res.add(arr);
                    }
                }
            }
        }
        return res;
    }

    //排序+双指针
    public static List<List<Integer>> threeSum_1(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int k = 0; k < nums.length - 2; k++) {

            if(k > 0 && nums[k] == nums[k - 1]) continue;

            for(int i = k + 1, j = nums.length-1; i < j; ) {
                if(nums[i] + nums[j] == -nums[k]) {
                    res.add(Arrays.asList(nums[k],nums[i++],nums[j--]));
                    while(i < j && nums[i] == nums[i - 1]){i++;}
                    while(i < j && nums[j] == nums[j + 1]){j--;}
                }
                if(nums[i] + nums[j] < -nums[k]) i++;
                if(nums[i] + nums[j] > -nums[k]) j--;
            }
        }
        return res;
    }

    //哈希表
    /*public static List<List<Integer>> threeSum_2(int[] nums) {

        HashMap<Integer,List<Integer>> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < nums.length - 1) {
            for(int j =i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if(!map.containsKey(sum)) {
                    map.put(sum,Arrays.asList(nums[i],nums[j]));
                }
                else {

                }
            }
        }
        return null;
    }*/
}
