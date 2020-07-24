package stageOne;
import java.util.ArrayList;
import java.util.List;
public class leetCode_22_generateParentheses {
    private static List<String> list;
    public static void main(String[] args) {
        generateParenthesis(3);
    }
    public static List<String> generateParenthesis(int n) {
        list= new ArrayList<String>();
        _generate(0,0,n,"");
        return list;
    }
    private static void _generate(int left,int right, int n, String s) {

        //terminater
            if(left==n&&right==n) {
                list.add(s);
            }
//        //process logic in current level
//            String s1=s+"(";
//            String s2=s+")";;

        //drill down
        if(left<n)
            _generate(left+1,right,n,s+"(");
        if(right<left)
        _generate(left,right+1,n,s+")");
        //reverse states
    }
}
