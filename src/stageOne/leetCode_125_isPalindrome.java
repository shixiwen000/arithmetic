/*
*     `0.特殊情况：大小写,去特殊字符
*      1.去掉多余字符，将字符收尾调换，与原字符串比较     三行代码
*      2.去掉多余字符，首尾指针，但要做很多其他的事      char数组
*
*/
package stageOne;

import java.util.Arrays;

public class leetCode_125_isPalindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    private static final char[]charMap = new char[256];//能赋值？？？？ 初值为0？？？
    static{
        for(int i=0;i<10;i++){
            charMap[i+'0'] = (char)(1+i);  // numeric
        }
        for(int i=0;i<26;i++){
            charMap[i+'a'] = charMap[i+'A'] = (char)(11+i);  //alphabetic, ignore cases
        }
    }
    public static boolean isPalindrome(String s) {
        char[]pChars = s.toCharArray();
        int start = 0,end=pChars.length-1;
        char cS,cE;
        while(start<end){
            cS = charMap[pChars[start]];
            cE = charMap[pChars[end]];
            if(cS!=0 && cE!=0){
                if(cS!=cE)return false;
                start++;
                end--;
            }else{
                if(cS==0)start++;
                if(cE==0)end--;
            }
        }
        return true;
    }
}
    /*
    public static boolean isPalinddrome(String s) {
        for(int start=0,end=s.length()-1;start<end;  ) {
            if(!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
                continue;
            }
            if(s.charAt(start)!=s.charAt(end)&&s.charAt(start)!=s.charAt(end)+32&&s.charAt(start)!=s.charAt(end)-32){
                return false;
            }
        }
        return true;
    }
}

    ********************************************************************************
    private static final char[]charMap = new char[256];
    static {
        for(int i=0;i<10;i++) {
            charMap[i+'0'] = (char)(1+i);  // numeric
        }
        for(int i=0;i<26;i++) {
            charMap[i+'a'] = charMap[i+'A'] = (char)(11+i);  //alphabetic, ignore cases
        }
    }
    public static void main(String[] args) {
        System.out.println(isPalinfrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalinfrome(String s) {
        char[] pChars = s.toCharArray();
        int start = 0, end = pChars.length - 1;
        char cS, cE;
        while (start < end) {
            cS = charMap[pChars[start]];
            cE = charMap[pChars[end]];
            if (cS != 0 && cE != 0) {
                if (cS != cE) return false;
                start++;
                end--;
            } else {
                if (cS == 0) start++;
                if (cE == 0) end--;
            }
        }
        return true;
    }

************************************************************************
     String pre=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
    String aft=new StringBuffer(pre).reverse().toString();
    return pre.equals(aft);
************************************************************************
      public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {
    String filterStr=filterUnNumAndChararcter(s);
    String reverseStr=reverseStr(filterStr);
    return filterStr.equalsIgnoreCase(reverseStr);
    }
    private static String filterUnNumAndChararcter(String s) {
        String regEx ="[^a-zA-Z0-9]";
        return s.replaceAll(regEx,"");
    }
    private static String reverseStr(String filterStr) {
       return  new StringBuffer(filterStr).reverse().toString();
    }
    **************************************************************************
    public static void main(String[] args) {
        System.out.println(isPalindrome("asa"));
    }
    public static boolean isPalindrome(String s) {
        char[] arr=s.toCharArray();
        for (int i=0,j=s.length()-1;i<j;i++,j--){
            if(arr[i]!=arr[j]){
                return false;
            }
        }
        return true;
    }
***************************************************************************
private static final char[]charMap = new char[256];
static{
    for(int i=0;i<10;i++){
        charMap[i+'0'] = (char)(1+i);  // numeric
    }
    for(int i=0;i<26;i++){
        charMap[i+'a'] = charMap[i+'A'] = (char)(11+i);  //alphabetic, ignore cases
    }
}
public boolean isPalindrome(String s) {
    char[]pChars = s.toCharArray();
    int start = 0,end=pChars.length-1;
    char cS,cE;
    while(start<end){
        cS = charMap[pChars[start]];
        cE = charMap[pChars[end]];
        if(cS!=0 && cE!=0){
            if(cS!=cE)return false;
            start++;
            end--;
        }else{
            if(cS==0)start++;
            if(cE==0)end--;
        }
    }
    return true;
}
    */

