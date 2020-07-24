package stageOne;
/*
* 1.sort思想
* 2.26思想
* */
import java.util.*;

public class leetCode_49_groupAnagrams {
    public static void main(String[] args) {
        String[] strs={ "eat", "tea", "tan", "ate", "nat", "bat"};
        Iterator<List<String>> it_0=groupAnagrams_0(strs).iterator();
        while(it_0.hasNext()){
            System.out.println(it_0.next());
        }
        Iterator<List<String>> it_1=groupAnagrams_1(strs).iterator();
        while(it_1.hasNext()){
            System.out.println(it_1.next());
        }
    }
    public static List<List<String>> groupAnagrams_0(String[] strs) {
        if(strs.length==0) return new ArrayList<>();
        Map<String,ArrayList<String>> res=new HashMap<>();
        for(String s:strs) {
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String key=String.valueOf(ch);
            if(!res.containsKey(key)) {
                res.put(key,new ArrayList<>());
            }
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }
    public static List<List<String>> groupAnagrams_1(String[] strs) {
        if(strs.length==0) return new ArrayList<>();
        Map<String,ArrayList<String>> res=new HashMap<>();
        int[] count=new int[26];
        for(String s:strs) {
            Arrays.fill(count,0);
            StringBuffer temp=new StringBuffer();
            for(char c:s.toCharArray()) count[c-'a']++;
            for(int i=0;i<26;i++) {
                temp.append('#');
                temp.append(count[i]);
            }
            String key=temp.toString();
            if(!res.containsKey(key)) {
                res.put(key,new ArrayList<>());
            }
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }
}

