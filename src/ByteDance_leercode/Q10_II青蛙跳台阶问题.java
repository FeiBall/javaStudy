package ByteDance_leercode;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO 时间N 空间1
 * @date 2021/3/13 12:45
 */
public class Q10_II青蛙跳台阶问题 {
    public int numWays(int n) {
        int a = 1, b = 1, sum;
        for(int i = 0; i < n; i++){
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
