package ByteDance_leercode;

import java.util.Scanner;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/13 16:02
 */
public class M美团1 {
    public static void main(String[] args) {
        int m,n;
        Scanner scanner=new Scanner(System.in);
        m=scanner.nextInt();
        n=scanner.nextInt();

        int[][] matrix1=new int[m][n];//输入数组
        int[][] matrix2=new int[n][m];//输出数组

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix1[i][j]=scanner.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix2[i][j]=matrix1[j][i];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix2[i][j]+" ");

            }
            System.out.println("");
        }




    }
}
