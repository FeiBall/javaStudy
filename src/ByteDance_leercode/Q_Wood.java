package ByteDance_leercode;

import java.util.Scanner;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO 给定长度为n的数组，每个元素代表一个木头的长度，木头可以任意截断，从这堆木头中截出至少k个相同长度为m的木块。已知k，求max(m)。
 *
 * 输入两行，第一行n, k，第二行为数组序列。输出最大值。
 * 输入
 * 5 5
 * 4 7 2 10 5
 * 输出
 * 4
 * @date 2021/3/10 14:23
 */
public class Q_Wood {



    public int Wood(int n,int k){
        int[] nums=new int[n];
        int max=0;//最长木材长度
        int min=0;
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
            max=Math.max(nums[i],max);//找出最长木材
            min=Math.min(nums[i],min);
        }
//        int max=Integer.MIN_VALUE;
//        for(int i=0;i<n;i++){//找到数组中最大元素
//            if(max<nums[i]){
//                max=nums[i];
//            }
//        }

        System.out.println("最长木材长度:"+max);
//        int m=1;
//        int res=0;//能截取的最长长度
//        while (m<=max){
//            int cnt=0;
//            for (int i = 0; i < n; i ++ ) {
//                cnt =cnt+ nums[i] / m;//能截出来几段木材
//            }
//            if (cnt >= k){ // 如果当前可以截出来超过k段，就更新结果,并停止循环
//                res = m;
//                break;
//            }else{
//                m ++;
//            }
//        }
//        return res;//返回长度
//        //时间复杂度：max*n

        /**
         * 使用二分法优化时间复杂度为n*log max
         */
        int l=min,r=max,mid=(l+r)/2;
        //4 2 7 10 5

        while(l<r){
            int res = 0;
            mid=(l+r)/2;
            for (int i = 0; i < n; i ++ ) res += nums[i] / mid;
            if (res>= k) {
                if(l==mid){
                    l++;
                }else{
                    l = mid;
                }
            }
            else r = mid - 1;
        }
        return l;


    }

}
