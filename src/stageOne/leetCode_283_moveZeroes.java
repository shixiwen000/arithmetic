/*
  重复性、边界、特殊
 1.
    统计零的个数，将非零元素加入容器，在末尾添零
 2.
    将非零元素向前移动，在末尾添零（双指针）
 */
package stageOne;

import java.util.Iterator;

public class leetCode_283_moveZeroes {
    public static void main(String[] args) {
        int[] nums={0,1,0,3,15};
        System.out.print("[");
        for(int num:moveZeroes(nums)){
            System.out.print(num+",");
        }
        System.out.print("]");
    //输出格式
}

   public static int[] moveZeroes(int[] nums) {

       int index = 0;//记录0位置
       for(int i = 0; i < nums.length; i++) {
           if(nums[i] != 0) {
               nums[index] = nums[i];
               if(i != index) {
                   nums[i] = 0;
               }
               index++;
           }
       }
       return nums;
   }
}
