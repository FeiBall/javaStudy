package leetcode_day1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/6 21:57
 */
public class Q1 {
    public int[] twoSum(int nums[], int target) {
        Map<Integer, Integer> codeMap = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(codeMap.containsKey(target - nums[i])){
                return new int[]{codeMap.get(target - nums[i]), i};
            }else{
                codeMap.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
