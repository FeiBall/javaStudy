package ByteDance_leercode;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/13 0:31
 */
public class Q260_3只出现一次的数 {
    public int[] singleNumber(int[] nums) {
        int mask=nums[0];
        for(int i=1;i<nums.length;i++){
            mask ^=nums[i];
        }

        mask &=-mask;

        int[] res={0,0};
        for(int i=0;i<nums.length;i++){
            if((nums[i]&mask)==0){
                res[0]^=nums[i];
            }else{
                res[1]^=nums[i];
            }
        }
        return res;

    }
}
