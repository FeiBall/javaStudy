package ByteDance_leercode;
import java.util.Arrays;
/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO 实现获取 下一个排列 的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
 *
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 *
 * 必须 原地 修改，只允许使用额外常数空间。
 */
public class Q31 {
    public void nextPermutation(int[] nums){
        int len=nums.length;
        for(int i=len-1;i>0;i--){
            if(nums[i]>nums[i-1]){//找到第一个升序数对
                Arrays.sort(nums, i, len);
                for(int j=i;j<len;j++){
                    if(nums[j]>nums[i-1]){
                        int temp = nums[j];
                        nums[j] = nums[i - 1];
                        nums[i - 1] = temp;
                        return;
                    }
                }

            }
        }
        Arrays.sort(nums);
        return;
    }


}
