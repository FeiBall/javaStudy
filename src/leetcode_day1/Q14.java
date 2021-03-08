package leetcode_day1;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 * @date 2021/3/7 21:50
 */
public class Q14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){return "";}
        String ans=strs[0];

        for(int i=1;i<strs.length;i++){
            int j=0;
            for(;j<ans.length()&&j<strs[i].length();j++){
                if(ans.charAt(j)!=strs[i].charAt(j)){
                    break;
                }
            }
            ans=ans.substring(0,j);
            if(ans.equals(""))
                return ans;
        }
        return ans;
    }
}
