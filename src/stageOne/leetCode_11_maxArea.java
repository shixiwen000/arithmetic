
package stageOne;


/*
O(n^2)
public class leetCode_11_maxArea {
    public static void main(String[] args) {
        int[] height={1,3,11,7,5,3,1,6,7,12,10};
        System.out.println(_maxArea(height));
    }
    public static int _maxArea(int[] height) {
        int max=0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                int area=(j-i)*getMinHeight(height[i],height[j]);
                max=getMaxArea(area,max);
            }
        }
        return max;
    }

    private static int getMaxArea(int area, int max) {
        return area>max? area:max;
    }

    private static int getMinHeight(int i, int i1) {
        return i<i1?i:i1;
    }
}
*/
public class leetCode_11_maxArea {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
   /* public static  int maxArea(int[] heights){
        int max=0;
        for(int i=0,j=heights.length-1;i<j;){
            int minHeight=heights[i]<heights[j]?heights[i++]:heights[j--];
            max=Math.max((j-i+1)*minHeight,max);//上面语句使得i或j变化，所以要+1
        }
        return max;
    }
    public  static int f(int[] heights) {
        int max=0;
        for(int i=0;i<heights.length-1;i++) {
            for(int j=i+1;j<heights.length;j++) {
                max=Math.max(max,(j-i)*Math.min(heights[i],heights[j]));
            }
        }
        return max;
    }*/

    public static int maxArea(int[] height) {

        int maxarea = 0;
        for(int head = 0,end = height.length - 1;head < end ;) {
        int  temp_area =(end - head)*Math.min(height[head],height[end]);
        if(temp_area > maxarea) maxarea = temp_area;
        if(height[head] > height[end]) end--;
        else head++;
    }
        return maxarea;
}
}