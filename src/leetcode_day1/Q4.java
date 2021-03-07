package leetcode_day1;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/6 21:42
 */
public class Q4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums;
        int m = nums1.length;//数组1的长度
        int n = nums2.length;//数组2的长度
        nums = new int[m + n];//数组3的长度
        if (m == 0) {//若数组1为空则看数组2
            if (n % 2 == 0) {
                return (nums2[n / 2 - 1] + nums2[n / 2]) / 2.0;//偶数个
            } else {

                return nums2[n / 2];//奇数个
            }
        }
        if (n == 0) {
            if (m % 2 == 0) {
                return (nums1[m / 2 - 1] + nums1[m / 2]) / 2.0;
            } else {
                return nums1[m / 2];
            }
        }

        //合并数组
        int count = 0;
        int i = 0, j = 0;
        while (count != (m + n)) {
            if (i == m) {//数组1遍历完了但数组2还没完
                while (j != n) {
                    nums[count++] = nums2[j++];
                }
                break;
            }
            if (j == n) {//数组2遍历完了但数组1还没完
                while (i != m) {
                    nums[count++] = nums1[i++];
                }
                break;
            }

            if (nums1[i] < nums2[j]) {
                nums[count++] = nums1[i++];
            } else {
                nums[count++] = nums2[j++];
            }
        }

        //判断数组的奇偶并返回中位数
        if (count % 2 == 0) {
            return (nums[count / 2 - 1] + nums[count / 2]) / 2.0;
        } else {
            return nums[count / 2];
        }
    }

}
