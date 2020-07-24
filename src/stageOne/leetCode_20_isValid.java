package stageOne;

import java.util.Stack;

public class leetCode_20_isValid {
    public static void main(String[] args) {
        String str1=null;
        String[] str={"(){}[]",   "",  " ",   "((())[])",   "( ( ))"};
        for(int i=0;i<str.length;i++)
            System.out.println(isValid(str[i]));
    }
    public static boolean isValid(String s){
        Stack<Character> stack=new Stack<Character>();
        for(char c:s.toCharArray()){
            if(c=='(')
                stack.push(')');
            else if(c=='[')
                stack.push(']');
            else if(c=='{')
                stack.push('}');
            else if(stack.isEmpty()||stack.pop()!=c)//考虑到栈为空
                return false;

        }
        return stack.isEmpty();
    }
}
