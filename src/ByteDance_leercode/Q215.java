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
public int findKthLargest(int[] nums, int k) {

    PriorityQueue<Integer> pqNums = new PriorityQueue<>(); //优先队列自动成为小根堆
    int n = nums.length;

    for (int i=0;i<n;i++) {
        pqNums.offer(nums[i]);
        if (pqNums.size() > k) {
            pqNums.poll();//移除堆顶元素
        }
    }
    return pqNums.peek(); //返回堆顶元素
}





}
