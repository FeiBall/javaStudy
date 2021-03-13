package ByteDance_leercode;

import java.util.Arrays;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO 时间N
 * @date 2021/3/13 13:33
 */
public class Q169多数元素 {
    public int majorityElement(int[] nums) {
        int count = 1;
        int maj = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (maj == nums[i])
                count++;
            else {
                count--;
                if (count == 0) {
                    maj = nums[i + 1];
                }
            }
        }
        return maj;
    }

    /**
     * 快排 NlogN
     */

    public int majorNumber(int []nums){
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

}
