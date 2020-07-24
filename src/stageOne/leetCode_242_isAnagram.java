package stageOne;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/*
* 遗留问题：  如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
*   字符串问题所能想到的东西：
*   1.有无特殊字符、有无空格
*   2.有ASCII码、有Unicode码
*   3.出去上述特殊条件，字符串逃不出十个数字，二十六个英文字符
*   4.二十六个字符与数字对应
* */
public class leetCode_242_isAnagram {
    public static void main(String[] args) {
        String s="abcde";
        String t="dbcae";
        System.out.println(isAnagram2(s,t));
    }
    //排序        我是傻逼
    public static boolean isAnagram0(String s, String t) {
        if(s.length()!=t.length()) {
            return false;
        }
        char[] str1=s.toCharArray();
        char[] str2=t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return  Arrays.equals(str1,str2);
    }
    //计数器 0     我有点不傻逼了
    public static boolean isAnagram1(String s, String t) {
        if(s.length()!=t.length()) {
            return false;
        }
        int[] counter=new int[26];
        for(int i=0;i<s.length();i++) {
            counter[s.charAt(i)-'a']++;
            counter[t.charAt(i)-'a']--;
        }
        for(int i:counter) {
            if(i!=0) {
                return false;
            }
        }
        return true;
    }
    //计数器 1
    public static boolean isAnagram2(String s, String t) {
        if(s.length()!=t.length()) {
            return false;
        }
        int[] counter=new int[26];
        for(int i=0;i<s.length();i++) {
            counter[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++) {
            counter[t.charAt(i)-'a']--;
            if(counter[t.charAt(i)-'a']<0) {      //必须得小于零，不能写!=0,这样写你就默认了一个字母只出现一次   我是傻逼
                return false;
            }
        }
        return true;
    }
  /*  public static boolean isAnagram(String s, String t) {
        Map<Character,Character> charMap=new HashMap<>();
        boolean isanagram=true;
        if(s.length()!=t.length()) {
            isanagram=false;
        }
        for(Character c:s.toCharArray()) {
            charMap.put(c,c) ;
        }
        for(Character c:t.toCharArray()) {
            if(!charMap.containsKey(c)) {
                isanagram=false ;
                break;
            }
        }
        return isanagram;
    }*/
}
