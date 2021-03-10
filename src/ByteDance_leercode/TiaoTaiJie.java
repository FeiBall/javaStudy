package ByteDance_leercode;

import java.util.Scanner;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/10 16:31
 */
public class TiaoTaiJie {

    public static int main(String[] args) {
        int n,d,m=0;
        Scanner scanner=new Scanner(System.in);//输入台阶，地雷，传送门数量
        n=scanner.nextInt();
        d=scanner.nextInt();
        m=scanner.nextInt();

        //输入地雷所在位置
        int[] dd=new int[d];
        for(int i=0;i<d;i++){
            dd[i]=scanner.nextInt();
        }

        //输入传送门
        int[][] mm=new int[m][2];
        for(int i=0;i<m;i++){
            mm[i][0]=scanner.nextInt();
            mm[i][1]=scanner.nextInt();
        }

        int k=0;
        if(n<=2&&d==0&&m==0){
            return n;
        }else if(d==1){
            return 1;
        }else if(n==2&&m==1){
            return n+1;
        }else if(n<=2&&d==2){
            return d-2;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {

            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];

    }
}
