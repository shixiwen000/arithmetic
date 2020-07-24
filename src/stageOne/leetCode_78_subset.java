package stageOne;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class leetCode_78_subset {
        public static void main(String arg[]){
            int[] nums= {1, 2, 3};
            Iterator<List<Integer>> it=subsets(nums).iterator();
            for(List<Integer> list:subsets(nums)){
                if(it.hasNext()){
                    System.out.println(it.next());
                }
            }
        }

        public static List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> result=new ArrayList<>();
            if(result==null){return result;}
            dfs(result,nums,new ArrayList<Integer>(),0);
            return result;
        }
        //为什么是void返回值？  传入的是result是对象
        public static void dfs(List<List<Integer>> result,int nums[],List<Integer> list,int index){
            //terminator
            if(index==nums.length){
                result.add(new ArrayList<Integer>(list));
                return;
            }
            dfs(result,nums,list,index+1);//no pick the number at this index
            list.add(nums[index]);              //pick the number at this index
            dfs(result,nums,list,index+1);
            //reverse the current state
            list.remove(list.size()-1);//在移除之前已经传到result中，非本层变量需要reversr state
            /*dfs(result,nums,list.clone(),index+1);
            list.add(nums[index]);              //pick the number at this index
            dfs(result,nums,list.clone(),index+1);
            */
            /*
                没有移除最后一个加入的元素的后果
                []
                [3]
                [3, 2]
                [3, 2, 3]
                [3, 2, 3, 1]
                [3, 2, 3, 1, 3]
                [3, 2, 3, 1, 3, 2]
                [3, 2, 3, 1, 3, 2, 3]

                []
                [3]
                [2]
                [2, 3]
                [1]
                [1, 3]
                [1, 2]
                [1, 2, 3]
                用树结构或堆栈来描述递归
             */
        }
}
