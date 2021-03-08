package leetcode_day1;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO 给你一个字符串 s，找到 s 中最长的回文子串。
 * @date 2021/3/6 21:58
 */
public class Q5 {
//    /**
//     * 暴力解法
//     * @param s
//     * @return
//     */
//    public boolean isPalindromic(String s) {//判断是否为回文串
//        int len = s.length();
//        for (int i = 0; i < len / 2; i++) {
//            if (s.charAt(i) != s.charAt(len - i - 1)) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    // 暴力解法
//    public String longestPalindrome(String s) {
//        String ans = "";
//        int max = 0;
//        int len = s.length();
//        for (int i = 0; i < len; i++)
//            for (int j = i + 1; j <= len; j++) {
//                String test = s.substring(i, j); //提取i,j下标之间的字符串
//                if (isPalindromic(test) && test.length() > max) {
//                    ans = s.substring(i, j);
//                    max = Math.max(max, ans.length());
//                }
//            }
//        return ans;
//    }

}
