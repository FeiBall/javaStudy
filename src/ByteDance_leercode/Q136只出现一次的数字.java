package ByteDance_leercode;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/13 0:26
 */
public class Q136只出现一次的数字 {
    /**
     * 位运算解决
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        if(nums.length==0) return 0;
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            res ^=nums[i];
        }
        return res;
    }
}
