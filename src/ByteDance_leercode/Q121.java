package ByteDance_leercode;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
 *
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 *
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 *。
 * @date 2021/3/8 21:31
 */
public class Q121 {
//    /**
//     * 暴力破解
//     * @param prices
//     * @return
//     */
//    public int maxProfit(int[] prices){
//        int len=prices.length;
//        if(len<2){
//            return 0;
//        }
//
//        int mp=0;//设置初始值为0.因为可能不发生交易
//
//        for(int i=0;i<len;i++){
//            for(int j=i+1;j<len;j++){
//                mp=Math.max(mp,prices[j]-prices[i]);
//            }
//        }
//        return mp;
//    }

    public int maxProfit(int[] prices){

        int len=prices.length;
        if(len<2){
            return 0;
        }

        int min=prices[0];
        int max=0;
        for(int i=1;i<len;i++){
            max=Math.max(max,prices[i]-min);
            min=Math.min(min,prices[i]);
        }
        return max;
    }
}
