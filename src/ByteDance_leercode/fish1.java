package ByteDance_leercode;

import java.util.Scanner;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/18 22:35
 */
public class fish1 {
    public int[] numberOfShelves (int N) {
        // write code here
//        Scanner scanner=new Scanner(System.in);
//        N=scanner.nextInt();
        double x=(1+N)*N/2;
        int y=(int)x;//元素总个数

        int[][] nums=new int[N][N+1];

        int row=0;//行坐标
        int bow=0;//列坐标

        int bow1=N;//边界
        int index=1;

        while(index<=y){
            for(int i=0;i<bow1;i++){//向下遍历
                nums[row][bow]=index;
                index ++;
                row++;
            }
            row--;
            bow1--;//边界减一
            row--;//更新起始坐标
            bow++;
            for(int i=0;i<bow1;i++){//右上遍历

                nums[row][bow]=index;
                row--;
                bow++;
                index++;
            }
            row++;
            bow--;
            bow1--;//边界--
            bow--;

            int yy=0;
            for(int i=0;i<bow1;i++){//想左遍历
                nums[row][bow]=index;
                bow--;
                index++;
            }
            bow++;
            bow1--;
            row++;
        }

        int[] res=new int[y];
        int k=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N-i;j++){
                res[k]=nums[i][j];
                k++;
            }
        }

//        for(int i=0;i<N;i++){
//            for(int j=0;j<N;j++){
//                System.out.print(nums[i][j]);
//            }
//            System.out.println("");
//        }

        return res;
    }
//    public static void main(String[] args) {
//        fish1 aaa=new fish1();
//        int [] bbb=aaa.numberOfShelves(3);
//        for(int i=0;i<bbb.length;i++)
//        System.out.print(bbb[i]);
//    }
}
