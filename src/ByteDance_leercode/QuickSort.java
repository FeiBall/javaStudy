package ByteDance_leercode;

import java.util.Arrays;
import java.util.Queue;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/20 1:32
 */
public class QuickSort {
    public void QuickSort(int[] nums,int left,int right){
        if(left<right){
            int pivot=Partition(nums,left,right);
            QuickSort(nums, left, pivot-1);
            QuickSort(nums, pivot+1, right);
        }
    }

    public int Partition(int[] nums,int left,int right){
        int pivot=nums[left];
        while (left<right){
            while(left<right&&pivot<nums[right]) right--;
            nums[left]=nums[right];
            while (left<right&&pivot>nums[left]) left++;
            nums[right]=nums[left];
        }

        nums[left]=pivot;
        return left;
    }


    public static void main(String[] args) {
        int[] test=new int[]{5,3,6,8,7};
        QuickSort aaa=new QuickSort();
        aaa.QuickSort(test,0,4);
        System.out.println(Arrays.toString(test));
    }
}
