package stageOne;
public class leetCode_50_Pow {
    public static void main(String arg[]){
    System.out.println(myPow(2,-3));
    }
    public static double myPow(double x, int n) {
        //n为负数的转换
        if(n<0){
            x=1/x;
            n=-n;
        }
        return fastPow(x,n);
    }
    public static double fastPow(double x,int n){
        System.out.println(x+" "+n);
        if(n==0)
            return 1.0;
          double half=fastPow(x,n/2);
          if(n%2==0)
              return half*half;
          else
              return  half*half*x;

    }
}
/*
*
* */