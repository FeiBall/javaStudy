package ByteDance_leercode;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO 一条包含字母 A-Z 的消息通过以下映射进行了 编码 ：
 *
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * 要 解码 已编码的消息，所有数字必须基于上述映射的方法，反向映射回字母（可能有多种方法）。例如，"111" 可以将 "1" 中的每个 "1" 映射为 "A" ，从而得到 "AAA" ，或者可以将 "11" 和 "1"（分别为 "K" 和 "A" ）映射为 "KA" 。注意，"06" 不能映射为 "F" ，因为 "6" 和 "06" 不同。
 *
 * 给你一个只含数字的 非空 字符串 num ，请计算并返回 解码 方法的 总数 。
 *
 * 题目数据保证答案肯定是一个 32 位 的整数。
 */
public class Q91 {
    //是一个dp问题
    //一个字母最大的对应数字是26
    //所以对于第i个位置来说，其可以构成字母的可能性是，自己单独，以及自己和前一个
    //所以对于该位置来说，其所依赖于前一个位置的个数，
    //dp[i]为前i个的编码方式
    //所以初始情况就是dp[0]=0,dp[1]=1
    //因为存在前导0，所以需要提前考虑,前导0视为错误
    //还存在一种情况，909这种，0无法和前面一个组成字母，也无法自己组成字母
    public int numDecodings(String s) {
        if(s.charAt(0)=='0') return 0;
        //创建状态数组并初始化
        int len = s.length();
        int[] dp = new int[len+1];
        dp[0] = 1;
        dp[1] = 1;

        //从第二个非0数开始
        //如果前一个数是0，则不存在和i-1的组成两位数的情况，不然会造成01也判断成了1
        for(int i=1; i<len; i++){
            String doubleNumStr = s.substring(i-1,i+1);
            int doubleNum = Integer.valueOf(doubleNumStr);
            if(doubleNum>=10&&doubleNum<=26){
                dp[i+1] = dp[i+1]+dp[i-1];
            }
            else if(s.charAt(i)=='0') return 0;
            if(s.charAt(i)!='0'){
                dp[i+1] += dp[i];
            }
        }
        return dp[len];
    }




}
