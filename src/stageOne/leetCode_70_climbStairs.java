package stageOne;

public class leetCode_70_climbStairs {
    public static void main(String[] args) {
    System.out.println(climbStairs_1(4));
    }
    public static int climbStairs(int n){
        /*1.数学归纳法
        *   f(1)=1
        *   f(2)=2
        *   f(3)=f(2)+f(1)
        *   f(n)=f(n-1)+f(n-2)
        *   斐波拉契数列  时间复杂度怎么算
        * */
        //对参数有必要做检测
        /*
        为什么这种实现时间复杂度很高
        if(n==1)return 1;
        if(n==2)return 2;
        else return climbStairs(n-1)+climbStairs(n-2);
        */
        if(n<=2)return n;
        int f1=1,f2=2,f3=3;
        for(int i=3;i<=n;i++){
            /*够傻逼，嗯
            if(i==1) return 1;
            if(i==2) return 2;
            else{
                f1=f2;
                f2=f3;
                f3=f1+f2;
            }
            */
            f3=f2+f1;
            f1=f2;
            f2=f3;
        }
        return f3;
    }

    public static int climbStairs_1(int n) {

        if(n <= 2) return n;
        int f1 = 1,f2 = 2 ,f3 = 3;
        for(int i = 3; i <= n; i++) {
            f3 = f2 + f1;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
}
