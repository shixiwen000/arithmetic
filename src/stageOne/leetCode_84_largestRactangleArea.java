package stageOne;

public class leetCode_84_largestRactangleArea {
    public static void main(String[] args) {
        int[] heights={2,1,5,6,2,3};
        System.out.println(largestRectangleArea1(heights));
    }
//    暴力
    public static int largestRectangleArea1(int[] heights) {
        int maxArea=Integer.MIN_VALUE;
        for(int i=0;i<heights.length-2;i++) {
            for(int j=i+1;j<heights.length-1;j++) {
                int minHeight=Integer.MAX_VALUE;
                for(int k=i;k<=j;k++) {
                    minHeight=Math.min(minHeight,heights[k]);
                }
                maxArea=Math.max(maxArea,(j-i+1)*minHeight);
            }
        }
        return maxArea;
    }
    //优化暴力      我TM居然蒙出来了
    public static int largestRectangleArea2(int[] heights) {
        int maxArea=0;
        for(int i=0;i<heights.length;i++) {
            int minHeight=heights[i];
            for(int j=i;j<heights.length;j++) {
                minHeight=Math.min(minHeight,heights[j]);
                maxArea=Math.max(maxArea,(j-i+1)*minHeight);
            }
        }
        return maxArea;
    }
    //分治

    //栈
    public static int largestRectangleArea3(int[] heights) {

        return 0;
    }

}
