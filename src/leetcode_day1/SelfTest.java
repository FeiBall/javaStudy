package leetcode_day1;

import java.util.HashMap;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/6 21:10
 */
public class SelfTest {
    public int lengthOfLongestSubstring(String s){
        HashMap<Character, Integer> map=new HashMap<>();
        int maxlen=0;
        int left = 0;
        if(s.length()==0){return 0;}
        for(int i=0;i<=s.length();i++){
            if(map.containsKey(s.charAt(i))){
                left=Math.max(left,map.get(s.charAt(i))+1);
            }

            map.put(s.charAt(i),i);
            maxlen=Math.max(left,i+1-left);
        }
        return maxlen;
    }

}
