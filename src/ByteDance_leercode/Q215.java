package ByteDance_leercode;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 * @date 2021/3/9 14:59
 */
public class Q215 {
//    /**
//     * 用库函数耍赖解法
//     */
//    public int findKthLargest(int[] nums, int k) {
//        int len = nums.length;
//        Arrays.sort(nums);
//        return nums[len - k];
//    }

//    /**
//     * 也算耍赖做法
//     * @param nums
//     * @param k
//     * @return
//     */
//    public int findKthLargest(int[] nums, int k) {
//
//    PriorityQueue<Integer> pqNums = new PriorityQueue<>(); //优先队列自动成为小根堆
//    int n = nums.length;
//
//    for (int i=0;i<n;i++) {
//        pqNums.offer(nums[i]);
//        if (pqNums.size() > k) {
//            pqNums.poll();//移除堆顶元素
//        }
//    }
//    return pqNums.peek(); //返回堆顶元素

    /**
     * 快排
     * @param nums
     * @param low
     * @param high
     */
    public static void quickSort(int []nums,int low,int high){
        if(low<high){
            int pivotpos=Partition(nums,low,high);//锚点
            quickSort(nums, low, pivotpos-1);//左边
            quickSort(nums, pivotpos+1, high);//右边
        }
    }

    public static int Partition(int[] nums,int low,int high){
        int pivot=nums[low];

        while (low<high){
            while(low<high&&pivot<=nums[high]) high--;
            nums[low]=nums[high];
            while(low<high&&nums[low]<=pivot) low++;
            nums[high]=nums[low];
        }
        nums[low]=pivot;
        return low;
    }

    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;

        // 转换一下，第 k 大元素的索引是 len - k
        int target = len - k;
        quickSort(nums,left,right);

        return nums[target];
    }












}
