package ByteDance_leercode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * @date 2021/3/9 16:26
 */
public class Q3 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        int maxlen=0;//记录最长不重复子串长度
        int left=0;//记录滑动窗口左边下标位置
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                left=Math.max(left,map.get(s.charAt(i))+1);
            }

            map.put(s.charAt(i),i);
            maxlen=Math.max(maxlen,i-left+1);

        }
        return maxlen;
    }
}
