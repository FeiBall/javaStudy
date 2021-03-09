package ByteDance_leercode;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nums2 的元素。
 *
 */
public class Q88 {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        while(m>0&&n>0){
            if(nums1[m-1]>nums2[n-1]){
                nums1[n+m-1]=nums1[m-1];
                m--;
            }else{
                nums1[n+m-1]=nums2[n-1];
                n--;
            }
        }
        for(int i=0;i<n;i++){
            nums1[i]=nums2[i];
        }
    }
}
//若是合并3个有序数组，就直接调用2次这个函数就好了。又或者一步到位直接每次3个尾端元素比较